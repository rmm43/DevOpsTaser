import xmltodict
import json
from gensim import corpora, models, similarities

# http://omz-software.com/pythonista/docs/ios/xmltodict.html

projects = ["jEdit"]

for project in projects:
	doc_file = open("./"+project+"/unknown-0.0.sacorpus","r")
	original_doc = doc_file.read()
	document = xmltodict.parse(original_doc)

	doc_list = document["syncorp"]["syndoc"]
	query_keywords = []
	method_name = []


	for syndoc in doc_list:
		method_name.append(syndoc['@name'])
		syntoks = syndoc["syntok"]
		temp = []
		if isinstance(syntoks, list):
			for syntok in syntoks:
				temp.append(syntok['#text'])
		elif isinstance(syntoks, dict):
			temp.append(syntoks['#text'])
		query_keywords.append(temp)

	#for item in query_keywords:
	#	print(item)

	dictionary = corpora.Dictionary(query_keywords)

	#print(dictionary.token2id)

	corpus = [dictionary.doc2bow(keywords) for keywords in query_keywords]

	lsi = models.LsiModel(corpus, id2word=dictionary, num_topics=100)
	index = similarities.MatrixSimilarity(lsi[corpus])

	query_file = open("/home/jon/Desktop/QueryProcessor/Jabref_Master.txt","r")
	for line in query_file:
		query = line.strip()
		first_space = query.find(' ')
		bug_number = query[:first_space]
		query_text = query[first_space+1:]

		vec_bow = dictionary.doc2bow(query_text.split())
		vec_lsi = lsi[vec_bow]

		sims = index[vec_lsi]
		sims = sorted(enumerate(sims), key=lambda item: -item[1])
		
		goldset_file = open("/home/jon/Desktop/QueryProcessor/Jabref_Master.txt","r")

	'''
	successful text extraction completed now instead of printing we need
	to compile the text into lists and then add each of those lists to a master list

	also check out item_depth
	'''
