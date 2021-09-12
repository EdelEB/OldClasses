//
//  CS288 HW_3
//  1.c
//
//  Created by Edel Enrico Barcenas on 3/10/21.
//  Copyright © 2021 Edel Enrico Barcenas. All rights reserved.

//  CS288 HW_3 Problem 1
//  create a c program that takes an unsigned int & range and print out the int representation of the bits
//  of that input within the range

#include <stdio.h>

int main() {

    unsigned int num;
    printf("Enter a number: ");
    scanf("%d", &num);

    int start;
    printf("Enter starting position of range: ");
    scanf("%d", &start);

    int end;
    printf("Enter ending position of range: ");
    scanf("%d", &end);

    if( end - start < 0){
        printf("Error: Range Invalid\nStart > End\n");
        return 1;
    }

    num = num >> start;                                         // cuts off right half up to range start
    unsigned mask = ( 2 << (end - start) ) - 1;                 // 000000111111 depending on range
    num = num & mask;                                           // 000000XXXXXX depending on num

    printf("%d\n", num);

    return 0;
}
