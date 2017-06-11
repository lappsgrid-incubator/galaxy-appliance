.PHONY: all gate stanford lingpipe masc oaqa

ALL=gate stanford lingpipe masc oaqa

all: $(ALL)

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

clean:
	make -C gate clean
	make -C stanford clean
	make -C lingpipe clean
	make -C masc clean
	make -C oaqa clean

