//
//  CS288 HW_3
//  2.c
//
//  Created by Edel Enrico Barcenas on 3/10/21.
//  Copyright © 2021 Edel Enrico Barcenas. All rights reserved.


#include <stdio.h>

int main() {

    short longest = 0, count = 0;
    unsigned int num;
    
    printf("Enter an integer: ");
    scanf("%d", &num);
    
    for(unsigned int curr = num ; curr > 0; curr = curr >> 1){
        if( curr & 1 ){
            count++;
            if(count > longest){
                longest = count;
            }
        }
        else{
            count = 0;
        }
    
    }
    
    printf("%d\n", longest);
    
    return 0;
    
}
