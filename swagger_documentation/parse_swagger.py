import json
import os
import sys
from collections import OrderedDict


def json_read(path):
    return json.loads(open(path).read(), object_pairs_hook=OrderedDict)


def json_write(path, data):
    with open(os.getcwd() + path, "w") as outfile:
        json.dump(data, outfile, indent=4)


def parse_models(models):
    for model_name in list(models.keys()):
        model = models[model_name]
        new_model = model
        if "allOf" in list(model.keys()):
            for reference in model["allOf"]:
                ref_name = reference["$ref"]
                ref_name = ref_name[ref_name.rfind("/") + 1 :]
                new_model["properties"].update(OrderedDict(models[ref_name]["properties"]))
        models[model_name] = new_model
    return models


def parse_paths(paths):
    for path_name in list(paths.keys()):
        path = paths[path_name]
        if "parameters" in list(path.keys()):
            additional_params = path["parameters"]
            methods = ["get", "post", "put", "delete"]
            for method in methods:
                if method in list(path.keys()):
                    if "parameters" in list(path[method].keys()):
                        path[method]["parameters"].extend(additional_params)
                    else:
                        path[method]["parameters"] = additional_params
        paths[path_name] = path
    return paths


def main(argv):

    swagger = json_read("swagger.json")
    swagger["host"] = argv[0]
    swagger["schemes"] = [argv[1]]

    json_write("/swagger.json", swagger)

    swagger["definitions"] = parse_models(swagger["definitions"])
    swagger["paths"] = parse_paths(swagger["paths"])

    json_write("/swagger_parsed.json", swagger)


if __name__ == "__main__":
    main(sys.argv[1:])
