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
	for dir in $(ALL) ; do make -C $dir clean ; done
	make -C galaxy clean

