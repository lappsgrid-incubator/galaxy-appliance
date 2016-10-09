#!/bin/bash
set -eu

# Since the .tgz packages are not kept in source control this script can be used
# to download any required packages.

SERVER=http://www.anc.org/downloads/docker

#PACKAGE_LIST="lsd vassar-gate vassar-models MASC-3.0.0 GateConverter_2.0.0 GateServices_2.0.0 MascDataSource_2.2.0 StanfordServices_2.1.0 LingpipeServices"
#PACKAGE_LIST="LingpipeServices"

if [ ! -d packages ] ; then
	mkdir packages
fi

cd packages

case "$1" in
	download)
		for package in $PACKAGE_LIST ; do
			wget $SERVER/$package.tgz
		done
		;;
	update)
		for package in $PACKAGE_LIST ; do
			if [ -e $package.tgz ] ; then
				echo "Skipping $package"
			else
				wget $SERVER/$package.tgz
			fi
		done
		;;
	clean)
		rm *.tgz
		;;
	*)
		echo "Unrecognized command $1"
		;;
esac


