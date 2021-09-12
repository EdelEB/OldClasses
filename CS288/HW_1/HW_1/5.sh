#!/bin/bash

#Edel Barcenas
#CS288 HW1 Problem 5
#2/17/21

#Sort command-line arguments in ascending order with basic command & array
#Bubble Sort was used 

i=0
for X in $@ ; do
        ARR[$i]=$X
        let i=$i+1
done


let ARR_SIZE=${#ARR[*]}

j=0
while [ $j -lt $ARR_SIZE ] ; do
        i=0
        while [ $i -lt $(($ARR_SIZE -1)) ] ; do
                CURR=${ARR[$i]}
                NEXT=${ARR[$i+1]}
                if [ $CURR -gt $NEXT ] ; then
                        ARR[$i+1]=$CURR
                        ARR[$i]=$NEXT
                fi
                let i=$i+1
        done
        let j=$j+1
done

for X in ${ARR[@]} ; do
        echo -n "$X "
done

echo
