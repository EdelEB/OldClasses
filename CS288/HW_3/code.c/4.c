//
//  CS288 HW_3
//  4.c
//
//  Created by Edel Enrico Barcenas on 3/10/21.
//  Copyright © 2021 Edel Enrico Barcenas. All rights reserved.
//
//  task: count number of zeros in string's bit representation

#include <stdio.h>

int main() {

    unsigned int count = 0;

    unsigned char str[127];                     //problem states string_length < 128
    printf("Enter string: ");
    fgets(str, 127, stdin);

    for(int i = 0; i < 127 ; i++){
        if(str[i]=='\n'){ break; }              //tests if end of string has been reached ; for some reason a '\n' is before the '\0'

        for(int j = 0; j<8 ; j++){
                if(!(str[i] & 0x01)){
                        count++;
                }
                str[i] = str[i] >> 1;
        }

    }
   
    printf("%d\n",count);

}
