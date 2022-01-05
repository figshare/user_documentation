import json
from collections import OrderedDict


def json_read(path):
    return json.loads(open(path).read(), object_pairs_hook=OrderedDict)


def read_file(path):
    data = json_read(path)
    return data


def read_index(path):
    data = json_read(path)
    current_dir_path = path[: path.rfind("/") + 1]
    big_dict = OrderedDict()
    for key in list(data.keys()):
        new_file = data[key]
        if key == "other":
            for directory in new_file:
                big_dict.update(read_index(current_dir_path + directory + "/index.json"))
        else:
            big_dict.update(read_file(new_file[1:]))
    return big_dict


swagger = json_read("index.json")
swagger["paths"].update(read_index("paths/index.json"))

swagger["definitions"].update(json_read("models/index.json"))

with open("swagger.json", "w") as outfile:
    json.dump(swagger, outfile, indent=4)
