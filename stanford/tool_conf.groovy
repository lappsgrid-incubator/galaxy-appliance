def tokenizer = 'stanford/tokenizer_2.0.0.xml'
def splitter  = 'stanford/splitter_2.0.0.xml'
def tagger = 'stanford/tagger_2.0.0.xml'
def names = 'stanford/ner_2.0.0.xml'

stanford 'Stanford NLP', {
	tools tokenizer, splitter, tagger, names
}

tokenizers { tool tokenizer }
splitters { tool splitter }
taggers { tool tagger }
ner { tool names }
 