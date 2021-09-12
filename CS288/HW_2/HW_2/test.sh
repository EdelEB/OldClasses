#!/bin/bash				
					
for WORD in `ls -l | grep ^-r..r..r..[[:space:]][0-9]*[[:space:]]` ; do		
	echo $WORD			
done					



