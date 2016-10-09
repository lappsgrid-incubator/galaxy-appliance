String tokenizer = "lingpipe/tokenizer_1.0.0.xml"
String splitter = "lingpipe/splitter_1.0.0.xml"
String tagger = "lingpipe/tagger_1.0.0.xml"
String ling_ner = "lingpipe/ner_1.0.0.xml"
String dictionary_ner = "lingpipe/dictionaryNER_1.0.0.xml"

lingpipe 'Lingpipe NLP', {
	tools tokenizer, splitter, tagger, ling_ner, dictionary_ner
}

tokenizers { tool tokenizer }
splitters { tool splitter }
taggers { tool tagger }
ner { tools ling_ner, dictionary_ner }
