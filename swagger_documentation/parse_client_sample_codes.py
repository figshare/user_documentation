from pprint import pprint
import json
from bs4 import BeautifulSoup

html_doc = open("html2/index.html").read()

soup = BeautifulSoup(html_doc, 'html.parser')

sections = soup.find(id='sections')

def getApiOperationID(name):
    name = name[:len(name)-2]
    name = name[name.rfind('-')+1:]
    return name

sample_code = {}

for section in sections.find_all('section'):
    for div in section.find_all('article'):
        operationId = getApiOperationID(div['id'])
        nav_tab = div.find("ul", 'nav nav-tabs nav-tabs-examples')
        tab_content = div.find("div", 'tab-content')
        sample_code[operationId] = (str(nav_tab),str(tab_content))


with open('sample_code.json', 'w') as outfile:
    json.dump(sample_code, outfile)