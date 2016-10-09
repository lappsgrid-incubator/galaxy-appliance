#!/bin/bash

for f in `ls gate.* | sed 's/gate\.//'` ; do
	echo $f
	mv "gate.$f" $f
done