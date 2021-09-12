//
//  main.c
//  HW_4
//
//  Goal: Implement radixSort
//
//  Created by Edel Enrico Barcenas on 3/29/21.
//  Copyright © 2021 Edel Enrico Barcenas. All rights reserved.
//

#include <stdio.h>

void radixSort(unsigned int* arr, unsigned int* maxLen) {
                                                            
    for(int i = 0 ; i < 31 ; i++){                          //32 bits in an int
        unsigned int zeroArray[*maxLen];                    //creates/resets array of elements with 0 in current bit position
        unsigned int z = 0;                                 //zeroArray counter
        unsigned int oneArray[*maxLen];                     //creates/resets array of elements with 1 in current bit postion
        unsigned int o = 0;                                 //oneArray counter
        
        for(int j = 0 ; j < *maxLen ; j++){
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
    
    unsigned int maxLen, negLen = 0, posLen = 0;                    // negLen + posLen = maxLen
    printf("Enter amount of floats you would like to enter: ");
    scanf("%d",&maxLen);
    
    float neg[maxLen], pos[maxLen];                                 //negative array and positive array of floats
    unsigned int *negArr = (unsigned int *) neg;                    //unsigned int representation of negative array
    unsigned int *posArr = (unsigned int *) pos;                    //unsigned int representation of positive array
    
    float curr;                                                     //current input being referenced
    //divides all input into two arrays : negatives and non-negatives
    for(int i = 1 ; i <= maxLen ; i++){
        printf("Enter float %d: ", i);
        scanf("%f", &curr);
        if(curr<0){
            neg[negLen] = curr;
            negLen++;
        }
        else{
            pos[posLen] = curr;
            posLen++;
        }
    }
    
    radixSort(negArr, &negLen);                                 //sorts negative array
    radixSort(posArr, &posLen);                                 //sorts positive array
    
    int j = 0;
    for(int i = negLen-1 ; i > -1 ; i--, j++){                      //negative order must be reversed
        printf("%f\n",neg[i]);
    }
    for(int k = 0; k < posLen ; k++, j++){
        printf("%f\n",pos[k]);
    }
    
    return 0;
}
