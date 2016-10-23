String tokenizer = "opennlp/tokenizer.xml"
String splitter = "opennlp/splitter.xml"
String tagger = "opennlp/tagger.xml"
String coref = "opennlp/coreference.xml"

opennlp 'Apache OpenNLP', {
	tools tokenizer, splitter, tagger, coref
}

tokenizers { tool tokenizer }
splitters { tool splitter }
taggers { tool tagger }
coreference 'Coreference Annotators', { tool coref }
