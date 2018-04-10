import xmltodict
import json
from gensim import corpora, models, similarities

# http://omz-software.com/pythonista/docs/ios/xmltodict.html

doc_file = open("unknown-0.0.sacorpus","r")
original_doc = doc_file.read()
document = xmltodict.parse(original_doc)

print(json.dumps(document))
