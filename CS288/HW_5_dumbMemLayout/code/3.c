
//  test.c
//  HW_5
//
//  Created by Edel Enrico Barcenas on 4/16/21.
//  Copyright © 2021 Edel Enrico Barcenas. All rights reserved.

/*
        This assignment is obviously incomplete. I was struggling to figure out how to manipulate the envp array.
        When I tried I kept receiving bus errors, or was told I am not allowed to access that memory. I attempted to
        make a new copy the **envp into a new array but received errors regarding the types because for some reason
        it would not let me copy the two dimensional array or something. Or I would receive segmentation faults.
        The only runnable code was this, which is me figuring out how to compare the array elements.
*/

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>


int main(int argc, char** argv, char* envp[]){


        int size = 1;
        while(envp[size]){
                char * temp1 = strtok(envp[size],"=");
                char * temp2 = strtok(envp[size-1],"=");
                if( strcmp(temp1, temp2)>0 ){
                        printf("%s \t:after:\t %s\n", temp1, temp2);
                }
                else{
                        printf("%s \t:before:\t %s\n", temp1, temp2);
                }
                size++;
        }

        for(int i = 0 ; i < size ; i++){

        }

}

/*
int cmpStr(char * curr, char * next) {
    for( int i = 0 ; ; i++){
        if(curr[i] == '=' && next[i] == '='){
            return -1;
        }
        else if(curr[i] == '=' && next[i] != '='){
            return 1;
        }
        else if(curr[i] != '=' && next[i] == '='){
            return 0;
        }
        else if(curr[i] < next[i]){
            return 1;
        }
        else if(curr[i] > next[i]){
            return 0;
        }
    }
}

int main( int argc, char ** argv, char * envp[] ){
    int size = 0;
    while(envp[size]){
        size++;
    }
    
    char *temp;
    for(int i = 0; i < size - 1; i++){
        for(int j = i+1; i < size ; j++){
            if(cmpStr(envp[i], envp[j]) == 1){
                temp = envp[i];
                envp[i] = envp[j];
                envp[j] = temp;
            }
        }
    }
    
    for(int i = 0 ; i < size ; i++){
        printf("%s\n", envp[i]);
    }
    
    return 0;
}

*/
