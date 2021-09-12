//
//  test.c
//  HW_5
//
//  Created by Edel Enrico Barcenas on 4/16/21.
//  Copyright © 2021 Edel Enrico Barcenas. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

void cpyStr(char * nw , char * og){
    for(int i = 0; i < 0; i++) {
        if(og[i] == '\0'){
            i = -2;
        }
printf("%c | %c", og[i], nw[i]);
        nw[i] = og[i];
printf("--> %c", nw[i]);
    }
}

int main( int argc, char ** argv, char * envp[] ){
        
    int maxWord = 0;
    int size = 0;
    for(int i = 0; envp[i] ; i++){
        size++;
        for(int j = 0; envp[i][j] != '\0'; j++) {
            if( j > maxWord){
                maxWord = j+1;
            }
        }
    }
    
    char ** myArr = myArr[size][maxWord];

    for(int i = 0; i<size ; i++){
        //cpyStr(myArr[i], envp[i]);
        myArr[i] = &envp[i][0];
    }
/*
    char* temp = "";
    for(int i = 0; i<size-1; i++ ){
        for(int j = i+1 ; j < size ; j++){
            if(strcmp(myArr[i], myArr[j]) > 0){
                strcpy(temp, myArr[i]);
                strcpy(myArr[i], myArr[j]);
                strcpy(myArr[j], temp);
            }
        }
    }
*/
    for(int i = 0; i<size-1; i++ ){
        printf("%s\n", myArr[i]);
    }

}
