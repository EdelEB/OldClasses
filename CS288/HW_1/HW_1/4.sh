#!/bin/bash 

#Edel Barcenas
#CS288 HW1 Problem 4
#2/17/21

#Reverse the order of files within directory arg[1]
#Mind filenames with whitespace
#No "sort -r" or "ls -r" allowed

if [ $1 -a -d $1 ] ; then

	pushd > /dev/null $1

	rename 's/ /%/g' *
	
	COUNT=`ls | wc -w`
	FILE_NUM=$COUNT
	
	for FILE in `ls` ; do
		ARR[$COUNT]=$FILE	
		let COUNT=$COUNT-1
	done

	for ((i=1;i<=$FILE_NUM;i++)) ; do
		echo -n  "`echo ${ARR[$i]} | tr '%' ' ' `   "	

	done

	rename 's/%/ /g' *	

	echo

	popd > /dev/null
else
	echo "Input a directory"
fi

