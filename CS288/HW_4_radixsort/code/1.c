//
//  main.c
//  HW_4
//
//  Created by Edel Enrico Barcenas on 3/29/21.
//  Copyright © 2021 Edel Enrico Barcenas. All rights reserved.
//

#include <stdio.h>

void radixSort(unsigned int* arr, unsigned int* arrLen) {
    for(int i = 0 ; i < 31 ; i++){                          //32 bits in an int
        unsigned int zeroArray[*arrLen];                  //creates/resets array of elements with 0 in current bit position
        unsigned int z = 0;                                 //zeroArray counter
        unsigned int oneArray[*arrLen];                   //creates/resets array of elements with 1 in current bit postion
        unsigned int o = 0;                                 //oneArray counter
        
        for(int j = 0 ; j < *arrLen ; j++){
            if(((arr[j]>>i) & 0x1) == 0x0){                 //checks if rightmost bit is a zero
                zeroArray[z] = arr[j];                      //appends to zeroArray
                z++;
            }
            else{                                           //rightmost bit !0 therefore 1
                oneArray[o] = arr[j];                       //appends to oneArray
                o++;
            }
        }
        for(int i = 0; i < z ; i++){                        //all elements of zeroArray placed in arr
            arr[i] = zeroArray[i];
        }
        for(int i = 0; i < o ; i++){                        //all elements of oneArray appended onto arr
            arr[z+i] = oneArray[i];
        }
    }
}

int main(int argc, const char * argv[]) {
    unsigned int arrLen;
    printf("Enter amount of numbers you would like to enter: ");
    scanf("%d",&arrLen);
    
    unsigned int arr[arrLen];                            //array used to get user inputed numbers, then it is sorted and returned
    for(int i = 0 ; i < arrLen ; i++){
        printf("Enter int %d: ", i+1);
        scanf("%d", &arr[i]);
    }
    
    radixSort(arr, &arrLen);
    
    for(int i = 0 ; i < arrLen ; i++){
        printf("%d\n", arr[i]);
    }
    return 0;
}
