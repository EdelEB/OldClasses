//
//  CS288 HW_3
//  4.c
//
//  Created by Edel Enrico Barcenas on 3/10/21.
//  Copyright © 2021 Edel Enrico Barcenas. All rights reserved.

#include <stdio.h>

int main() {

    unsigned char temp;

    unsigned char str[127];                     //problem states string_length < 128
    printf("Enter string: ");
    fgets(str, 127, stdin);

    for(int i = 0; i < 127 ; i++){
        if(str[i]=='\0'){ break; }

        temp = (~str[i]) & 0x0F;
        str[i] = str[i] & 0xF0;
        str[i] = str[i] | temp;
    }

    printf("%s\n", str);

    return 0;
}

