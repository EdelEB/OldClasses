#!/bin/bash
	
#Edel Barcenas
#CS288 HW_2 Problem_1
#2/22/21
	
#arg1 Directory, arg2 Username
#Task: search arg1 and is subdirectories(recursively) for files that are owned by arg2, but can be read by any user
	
function dive(){
	
	cd $1	
	
	for FILE in `ls` ; do
		if [ -d $FILE ] ; then
			dive $FILE $2
		fi
	done
	
	
	i=0	
	for WORD in ` ls -l | grep ^-r..r..r..[[:space:]][0-9]*[[:space:]]$2[[:space:]] ` ; do
		if [ $i -eq 0 ] ; then
			PRINT="$WORD : "
		elif [ $i -eq 8 ] ; then
			PRINT="$WORD : $PRINT"
			echo $PRINT
			i=-1
		elif [ $i -gt 4 ] ; then
			PRINT="$PRINT $WORD"
		fi
		let i=$i+1
	done
	cd ..
	
}	
	
if [ -d $1 ] ; then
	dive $1 $2
else	
	echo "INPUT ERROR"
	echo "$1 is not a directory" 
fi 	
