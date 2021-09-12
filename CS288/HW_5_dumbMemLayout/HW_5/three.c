//
//  three.c
//  HW_5
//
//  Created by Edel Enrico Barcenas on 4/16/21.
//  Copyright © 2021 Edel Enrico Barcenas. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

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

