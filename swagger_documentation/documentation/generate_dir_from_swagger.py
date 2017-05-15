import json
import os
import shutil
from pprint import pprint
from collections import OrderedDict

def json_write(path,data):
    with open(os.getcwd()+path, 'w') as outfile:
        json.dump(data, outfile, indent=4)

def json_read(path):
    return json.loads(open(path).read(), object_pairs_hook=OrderedDict)
"""
def getPathAtDepth(path,depth):
    slashes = 0
    slashIndex = 0
    for character in path:
        if character == '/':
            slashes+=1
            if slashes==depth:
                break
        slashIndex+=1
    if slashes==depth:
        partialPath = path[slashIndex+1:]
        endIndex = partialPath.find('/')
        if endIndex==-1:
            endIndex = len(partialPath)
        return partialPath[:endIndex]


def getFullPathAtDepth(path,depth):
    slashes = 0
    slashIndex = 0
    for character in path:
        if character == '/':
            slashes+=1
            if slashes==depth:
                break
        slashIndex+=1
    if slashes==depth:
        partialPath = path[slashIndex+1:]
        return partialPath.replace('/','_')

def getMaxDepthForPath(path):
    return path.count('/')


def groupPaths(paths, depth, currentPath):
    #import pdb; pdb.set_trace()
    pathsLevel = OrderedDict()
    for path in paths.keys():
        p = getPathAtDepth(path,depth)
        if p not in pathsLevel.keys():
            pathsLevel[p] = OrderedDict()
        pathsLevel[p][path] = paths[path]
    for p in pathsLevel.keys():
        os.mkdir(os.getcwd()+currentPath+'/'+p)
        index = OrderedDict()
        goFurther = OrderedDict()
        for path in pathsLevel[p]:
            if getMaxDepthForPath(path) == depth or depth==maxDepth:
                pName = getFullPathAtDepth(path,depth)
                file_name = currentPath+'/'+p+'/'+pName+'.json'
                json_write(file_name,{path:pathsLevel[p][path]})
                index[path]=file_name
            else:
                goFurther[path]=pathsLevel[p][path]
        index['other'] = groupPaths(goFurther,depth+1,currentPath+'/'+p)
        json_write(currentPath+'/'+p+'/index.json', index)
    return pathsLevel.keys()

"""

def getPathTag(path):
    tag = 'other'
    methods = ['get','post','put','delete']
    for method in methods:
        if method in path:
            tag = path[method]['tags'][0]
            break
    return tag


def groupPathsByTags(paths):
    paths_by_tags = OrderedDict()
    for path_key in paths.keys():
        path = paths[path_key]
        tag = getPathTag(path)
        if tag not in paths_by_tags:
            paths_by_tags[tag] = OrderedDict()
        paths_by_tags[tag][path_key] = path
    return paths_by_tags


def group_models_by_tags(models):
    models_by_tags = OrderedDict()
    for model_key in models.keys():
        model = models[model_key]
        if 'x-tag' not in model:
            print "I dont have a tag: {}".format(model_key)
            continue
        tag = model['x-tag']
        if tag not in models_by_tags:
            models_by_tags[tag] = OrderedDict()
        models_by_tags[tag][model_key] = model
    return models_by_tags


def find_model(ref, models):
    for tag in models:
        model_list = models[tag]
        if ref in model_list:
            return tag+'.json'



def resolve_models_model_refs(models):
    for tag in models:
        model_list = models[tag]
        for model_key in model_list:
            model = model_list[model_key]
            if 'allOf' in model:
                ref = model['allOf'][0]['$ref']
                ref = ref[ref.rfind('/')+1:]
                if ref in model_list:
                    model['allOf'][0] = {'$ref': '#'+ref}
                else:
                    model['allOf'][0] = {'$ref': find_model(ref, models) + '#' + ref}
            for prop_key, prop in model['properties'].iteritems():
                if '$ref' in prop:
                    ref = prop['$ref']
                    ref = ref[ref.rfind('/') + 1:]
                    if ref in model_list:
                        prop['$ref'] = '#' + ref
                    else:
                        prop['$ref'] = find_model(ref, models) + '#' + ref
                if 'items' in prop:
                    prop = prop['items']
                    if '$ref' in prop:
                        ref = prop['$ref']
                        ref = ref[ref.rfind('/') + 1:]
                        if ref in model_list:
                            prop['$ref'] = '#' + ref
                        else:
                            prop['$ref'] = find_model(ref, models) + '#' + ref


def resolve_paths_model_refs(paths, models):
    path_json = json.dumps(paths)
    found_index = 0
    control = 0
    while control<500:
        found_index = path_json.find('#/definitions', found_index+1)
        control+=1
        if found_index>0:
            model = path_json[found_index+14:path_json.find('"', found_index)]
            replace_with = '../models/'+str(find_model(model, models))+'#'
            first_part = path_json[:found_index]
            second_part = path_json[found_index+14:]
            path_json = str(first_part)+replace_with+str(second_part)
        else:
            break
    return json.loads(path_json, object_pairs_hook=OrderedDict)



def itemsToFiles(items,type):
    for tag in items.keys():
        json_write('/{}/{}.json'.format(type, tag), items[tag])

def construct_items_ref_list(items,type):
    ref_list = []
    for tag in items.keys():
        file_path = '{}/{}.json'.format(type, tag)
        ref_list.append({"$ref": file_path})
    return ref_list



Swagger = json_read('../swagger.json')
shutil.rmtree(os.getcwd()+'/paths')
os.mkdir(os.getcwd()+'/paths')

paths = OrderedDict()
paths = groupPathsByTags(Swagger['paths'])
models = OrderedDict()
models = group_models_by_tags(Swagger['definitions'])

resolve_models_model_refs(models)
paths = resolve_paths_model_refs(paths, models)

itemsToFiles(paths, 'paths')
itemsToFiles(models, 'models')

Swagger['paths'] = construct_items_ref_list(paths, 'paths')
Swagger['definitions'] = construct_items_ref_list(models, 'models')

json_write('/swagger_parsed.json', Swagger)

#pathsToFiles(paths)
#print json.dumps(paths['articles'], indent=4)
#json_write('/paths/index.json', index)
#json_write('/models/index.json', Swagger['definitions'])
