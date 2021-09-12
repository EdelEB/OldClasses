#!/bin/bash

#Edel Barcenas
#CS288 HW1 Problem 2
#2/17/21

#Remove all empty files in current and sub directories


if [ -d $1 ] ; then
        DIR=$1
else
        DIR="."
fi

function traverse(){
        cd $1
        for FILE in `ls` ; do
                if [ -d $FILE ] ; then
                        traverse $FILE
                elif [ ` du $FILE | tr '[:space:]' ' ' | cut -d ' ' -f1 ` = 0 ] ; then
                        rm $FILE
                fi
        done

        cd ..

        return
}

traverse $DIR


