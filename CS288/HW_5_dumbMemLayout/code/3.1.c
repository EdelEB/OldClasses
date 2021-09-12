//
//  3.1.c
//  
//
//  Created by Edel Enrico Barcenas on 4/18/21.
//


#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>


int main(int argc, char** argv, char* envp[]){

    char ** myArr[10];
    
    int size = 0;
        while(envp[size]){
                printf("%s\n", strtok(envp[size]), "=");
                size++;
        }
        printf("size = %d\n" , size );

}

