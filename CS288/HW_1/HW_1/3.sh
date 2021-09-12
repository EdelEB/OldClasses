#!/bin/bash

#Edel Barcenas
#CS288 HW1 Problem 3
#2/17/21

#List number of occurences of each file starting letter in working directory

for LETTER in a b c d e f g h i j k l m n o p q r s t u v w x y z ; do 
	LET_COUNT=0
	for LINE in `ls /bin | sort | cut -c 1` ; do
		if [ $LETTER = $LINE ] ; then

			LET_COUNT=`expr $LET_COUNT + 1`
		fi
	done
	echo "$LETTER $LET_COUNT"
done
