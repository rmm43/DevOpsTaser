import xmltodict
import json
from gensim import corpora, models, similarities

# http://omz-software.com/pythonista/docs/ios/xmltodict.html

projects = ["jEdit", "Jabref"]

for project in projects:
	doc_file = open("./"+project+"/unknown-0.0.sacorpus","r")
	original_doc = doc_file.read()
	document = xmltodict.parse(original_doc)

	doc_list = document["syncorp"]["syndoc"]
	query_keywords = []
	method_names = []


	for syndoc in doc_list:
		method_names.append(syndoc['@name'])
		syntoks = None
		if "syntok" in syndoc.keys():
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

	query_file = open("/home/jon/Desktop/QueryProcessor/"+project+"_Master.txt","r")
	results_file = open(project+"_ResultsClass.csv", "w")
	for line in query_file:
		query = line.strip()
		first_space = query.find(' ')
		bug_number = query[:first_space]
		query_text = query[first_space+1:]

		vec_bow = dictionary.doc2bow(query_text.split())
		vec_lsi = lsi[vec_bow]

		sims = index[vec_lsi]
		sims = sorted(enumerate(sims), key=lambda item: -item[1])
		
		try:
			goldset_file = open("/home/jon/Desktop/QueryProcessor/"+project+"/GoldSets/GoldSet"+bug_number+".txt","r")
		except IOError:
			continue
		
		goldset = []
		for method in goldset_file:
			goldset.append(method.strip())
		
		first_relevant_rank = 0
		method_name = ''
		current = 1
		for sim in sims:
			if method_names[sim[0]] in goldset:
				first_relevant_rank = current
				method_name = method_names[sim[0]]
				break
			current += 1
		results_file.write(bug_number+", "+str(first_relevant_rank)+", "+method_name+"\n")		


