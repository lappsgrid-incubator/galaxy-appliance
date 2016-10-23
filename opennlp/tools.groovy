// A Groovy DSL used to generate Galaxy's tool XML wrapper files.
tokenizer(id:'opennlp.tokenizer', name:'OpenNLP Tokenizer', version:'1.0.0') {
    description "tokenizes the input text."
    command 'lsd', 'invoke.lsd Tokenizer $input $output'
    inputs {
        param name:'input', type:'data', format:'lif', label:'Input'
    }
    outputs {
        data name:'output', format:'lif', label:'Tokens'
    }
    help "The tokenizer accepts text documents in LIF containers."
}
tagger(id:'opennlp.tagger', name: 'OpenNLP POS Tagger', version:'1.0.0') {
    description 'assigns part of speech tags to tokens.'
    command 'lsd', 'invoke.lsd POSTagger $input $output'
    inputs {
        param name:'input', type:'data', format:'lif', label:'Input'
    }
    outputs {
        data name:'output', format:'lif', label: 'POS Tags'
    }
    help "Requires tokenized text in a LIF container."
}
splitter(id:'opennlp.splitter', name: 'OpenNLP Sentence Splitter', version:'1.0.0') {
    description 'OpenNLP sentence splitter'
    command 'lsd', 'invoke.lsd Splitter $input $output'
    inputs {
        param name:'input', type:'data', format:'lif', label:'Input'
    }
    outputs {
        data name:'output', format:'lif', label:'Sentences'
    }
    help "Adds sentence boundaries to tokenized text in a LIF container."
}
coreference(id:'opennlp.coreference', name:'OpenNLP Coreference', version:'1.0.0') {
    description 'adds OpenNLP coreference annotations'
    command 'lsd', 'invoke.lsd Coreference $input $output'
    inputs {
        param name:'input', type:'data', format:'lif', label:'Input'
    }
    outputs {
        data name:'output', format:'lif', label:'Coreference'
    }
    help "Requires tokenized text."
}
parser(id:'opennlp.parser', name:'OpenNLP Parser', version:'1.0.0') {
	description 'OpenNLP parser'
	command 'lsd', 'invoke.lsd Parser $input $output'
    inputs {
        param name:'input', type:'data', format:'lif', label:'Input'
    }
    outputs {
        data name:'output', format:'lif', label:'Parse'
    }
    help "Requires sentence and token+pos annotations."
}
