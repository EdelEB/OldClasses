#!/bin/bash 




if [ -d $1 ] ; then
        DIR=$1
else
        DIR="."
fi


for ENTRY in `du $FILE | tr '[:space:]' ' ' | cut -d ' ' ` ; do

	echo $ENTRY
done
