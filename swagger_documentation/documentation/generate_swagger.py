import json
from pprint import pprint
from collections import OrderedDict

def json_read(path):
    return json.loads(open(path).read(), object_pairs_hook=OrderedDict)

def read_file(path):
    data = json_read(path)
    return data


def read_index(path):
    data = json_read(path)
    current_dir_path = path[:path.rfind('/')+1]
    bigDict = OrderedDict()
    for key in data.keys():
        new_file = data[key]
        if key == 'other':
            for dir in new_file:
                bigDict.update(read_index(current_dir_path+dir+'/index.json'))
        else:
            bigDict.update(read_file(new_file[1:]))
    return bigDict

Swagger = json_read('index.json')
Swagger['paths'].update(read_index('paths/index.json'))

Swagger['definitions'].update(json_read('models/index.json'))

with open('swagger.json', 'w') as outfile:
    json.dump(Swagger, outfile, indent=4)
"""
with open('swagger.yml', 'w') as outfile:
    yaml.dump(Swagger, outfile, default_flow_style=False)
"""

