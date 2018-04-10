import xmltodict
import json
from gensim import corpora, models, similarities

# http://omz-software.com/pythonista/docs/ios/xmltodict.html

doc_file = open("unknown-0.0.sacorpus","r")
original_doc = doc_file.read()
document = xmltodict.parse(original_doc)

doc_list = document["syncorp"]["syndoc"]
query_keywords = []


for item in doc_list:
	print item["syntok"]



'''
for syndoc in doc_list:
	syntoks = syndoc["syntok"]
	temp = []
	if isinstance(syntoks, list):
		for syntok in syntoks:
			temp.append(syntok['#text'])
	elif isinstance(syntoks, dict):
		temp.append([syntoks['#text']])
	query_keywords.append(temp)
'''
'''
dictionary = corpora.Dictionary(query_keywords)

for item in dictionary:
	print(item)

corpus = [dictionary.doc2bow(keywords) for keywords in query_keywords]

lsi = models.LsiModel(corpus, id2word=dictionary, num_topics=2)
index = similarities.MatrixSimilarity(lsi[corpus])
'''
'''
successful text extraction completed now instead of printing we need
to compile the text into lists and then add each of those lists to a master list

also check out item_depth
'''
