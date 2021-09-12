#!/bin/bash

#Edel Barcenas
#CS288 HW1 Problem 1
#2/17/21

#Check file size of arg[1]

if [ -d $1 ] ; then
	echo "Directory Inputed"
elif [ -f $1 ] ; then

	SIZE=`du -b $1 | tr '[:space:]' ' ' | cut -d ' ' -f 1`

	if [ $SIZE -ge 1048577 ] ; then 
		echo "large file"
	elif [ $SIZE -ge 102401 ] ; then
		echo "medium file"
	else
		echo "small file"
	fi
else
	echo "File Does Not Exist"
fi


