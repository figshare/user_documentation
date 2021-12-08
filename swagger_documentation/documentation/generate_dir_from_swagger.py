import json
import os
import shutil
from collections import OrderedDict


def json_write(path, data):
    with open(os.getcwd() + path, "w") as outfile:
        json.dump(data, outfile, indent=4)


def json_read(path):
    return json.loads(open(path).read(), object_pairs_hook=OrderedDict)


def get_path_tag(path):
    tag = "other"
    methods = ["get", "post", "put", "delete"]
    for method in methods:
        if method in path:
            tag = path[method]["tags"][0]
            break
    return tag


def group_paths_by_tag(paths):
    paths_by_tags = OrderedDict()
    for path_key in list(paths.keys()):
        path = paths[path_key]
        tag = get_path_tag(path)
        if tag not in paths_by_tags:
            paths_by_tags[tag] = OrderedDict()
        paths_by_tags[tag][path_key] = path
    return paths_by_tags


def group_models_by_tags(models):
    models_by_tags = OrderedDict()
    for model_key in list(models.keys()):
        model = models[model_key]
        if "x-tag" not in model:
            print("I dont have a tag: {}".format(model_key))
            continue
        tag = model["x-tag"]
        if tag not in models_by_tags:
            models_by_tags[tag] = OrderedDict()
        models_by_tags[tag][model_key] = model
    return models_by_tags


def find_model(ref, models):
    for tag in models:
        model_list = models[tag]
        if ref in model_list:
            return tag + ".json"


def resolve_models_model_refs(models):
    for tag in models:
        model_list = models[tag]
        for model_key in model_list:
            model = model_list[model_key]
            if "allOf" in model:
                ref = model["allOf"][0]["$ref"]
                ref = ref[ref.rfind("/") + 1 :]
                if ref in model_list:
                    model["allOf"][0] = {"$ref": "#" + ref}
                else:
                    model["allOf"][0] = {"$ref": find_model(ref, models) + "#" + ref}
            for prop_key, prop in model["properties"].items():
                if "$ref" in prop:
                    ref = prop["$ref"]
                    ref = ref[ref.rfind("/") + 1 :]
                    if ref in model_list:
                        prop["$ref"] = "#" + ref
                    else:
                        prop["$ref"] = find_model(ref, models) + "#" + ref
                if "items" in prop:
                    prop = prop["items"]
                    if "$ref" in prop:
                        ref = prop["$ref"]
                        ref = ref[ref.rfind("/") + 1 :]
                        if ref in model_list:
                            prop["$ref"] = "#" + ref
                        else:
                            prop["$ref"] = find_model(ref, models) + "#" + ref


def resolve_paths_model_refs(paths, models):
    path_json = json.dumps(paths)
    found_index = 0
    control = 0
    while control < 500:
        found_index = path_json.find("#/definitions", found_index + 1)
        control += 1
        if found_index > 0:
            model = path_json[found_index + 14 : path_json.find('"', found_index)]
            replace_with = "../models/" + str(find_model(model, models)) + "#"
            first_part = path_json[:found_index]
            second_part = path_json[found_index + 14 :]
            path_json = str(first_part) + replace_with + str(second_part)
        else:
            break
    return json.loads(path_json, object_pairs_hook=OrderedDict)


def item_to_files(items, file_type):
    for tag in list(items.keys()):
        json_write("/{}/{}.json".format(file_type, tag), items[tag])


def construct_items_ref_list(items, file_type):
    ref_list = []
    for tag in list(items.keys()):
        file_path = "{}/{}.json".format(file_type, tag)
        ref_list.append({"$ref": file_path})
    return ref_list


Swagger = json_read("../swagger.json")
shutil.rmtree(os.getcwd() + "/paths")
os.mkdir(os.getcwd() + "/paths")

paths: OrderedDict = group_paths_by_tag(Swagger["paths"])
models: OrderedDict = group_models_by_tags(Swagger["definitions"])

resolve_models_model_refs(models)
paths = resolve_paths_model_refs(paths, models)

item_to_files(paths, "paths")
item_to_files(models, "models")

Swagger["paths"] = construct_items_ref_list(paths, "paths")
Swagger["definitions"] = construct_items_ref_list(models, "models")

json_write("/swagger_parsed.json", Swagger)
