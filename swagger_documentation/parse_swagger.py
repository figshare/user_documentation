from pprint import pprint
import json
import os
import sys, getopt
from collections import OrderedDict


def json_read(path):
    return json.loads(open(path).read(), object_pairs_hook=OrderedDict)


def json_write(path,data):
    with open(os.getcwd()+path, 'w') as outfile:
        json.dump(data, outfile, indent=4)


def parse_models(models):
    for modelName in models.keys():
        model = models[modelName]
        newModel = model
        if 'allOf' in model.keys():
            #import pdb; pdb.set_trace()
            for reference in model['allOf']:
                refName = reference['$ref']
                refName = refName[refName.rfind('/')+1:]
                newModel['properties'].update(OrderedDict(models[refName]['properties']))
        models[modelName] = newModel
    return models


def parse_paths(paths):
    for pathName in paths.keys():
        path = paths[pathName]
        if 'parameters' in path.keys():
            additionalParams = path['parameters']
            methods = ['get','post','put','delete']
            for method in methods:
                if method in path.keys():
                    if 'parameters' in path[method].keys():
                        path[method]['parameters'].extend(additionalParams)
                    else:
                        path[method]['parameters'] = additionalParams
        paths[pathName] = path
    return paths


def main(argv):

    Swagger = json_read('swagger.json')
    Swagger['host'] = argv[0]
    Swagger['schemes'] = [argv[1]]

    json_write('/swagger.json', Swagger)


    Swagger['definitions'] = parse_models(Swagger['definitions'])
    Swagger['paths'] = parse_paths(Swagger['paths'])

    json_write('/swagger_parsed.json', Swagger)

if __name__ == '__main__':
    main(sys.argv[1:])
