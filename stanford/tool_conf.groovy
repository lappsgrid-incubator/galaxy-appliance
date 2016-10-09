def tokenizer = 'stanford/tokenizer.xml'
def splitter  = 'stanford/spitter.xml'
def tagger = 'stanford/tagger.xml'
def names = 'stanford/ner.xml'

stanford 'Stanford NLP', {
	tools tokenizer, splitter, tagger, names
}

tokenizers { tool tokenizer }
splitters { tool splitter }
taggers { tool tagger }
ner { tool names }
 