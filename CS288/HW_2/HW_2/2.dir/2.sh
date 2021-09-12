#!/bin/bash

wget https://en.wikipedia.org/wiki/$1 -O $1.html

lynx --dump ./$1.html > $1.txt

for WORD in ` cat $1.txt | tr -d \[ | tr -d \] | tr -d \' | tr -d https | tr -d file: | tr -c [[:alpha:]] " " | tr [[:upper:]] [[:lower:]]` ; do
	echo $WORD >> wordList.txt
done

ARR=( )

for WORD in ` cat wordList.txt | sort | uniq ` ; do 
	TEMP="`grep -o ^$WORD$ wordList.txt | wc -l`     $WORD" 	
	ARR[${#ARR[@]}]=$TEMP
done

rm wordList.txt

for((i=0;i<${#ARR[@]};i++)) ; do 
	echo ${ARR[i]} >> wordList.txt
done

cat wordList.txt | sort -g | uniq | tail -5
