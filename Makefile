
all: gate stanford lingpipe masc oaqa

gate:
	cd gate; make

stanford:
	cd stanford; make
	
lingpipe:
	cd lingpipe; make
	
masc:
	cd masc; make

oaqa:
	cd oaqa; make

