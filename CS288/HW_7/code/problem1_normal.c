//
//  main.c
//  HW_7
//  Problem1_normal
//
//  Goal: read in a list of floats from a binary file, sort the data, overwrite the file
//  with the new data.
//
//  Created by Edel Enrico Barcenas on 5/8/21.
//  Copyright © 2021 Edel Enrico Barcenas. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>

void radixSort(unsigned int* arr, unsigned int* maxLen) {
                                                            
    for(int i = 0 ; i < 31 ; i++){                          //32 bits in an int
        unsigned int *zeroArray, *oneArray;                 //creates/resets array pointers for zero and one buckets
        zeroArray = (unsigned int *)malloc(*maxLen * sizeof(unsigned int));
        oneArray = (unsigned int *)malloc(*maxLen * sizeof(unsigned int));
        unsigned int z = 0;                                 //zeroArray counter
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
        
        
        free(zeroArray);        //don't forget to free the memory you shmuck
        free(oneArray);         //don't forget to free the memory you shmuck
    }
}

int sort(float* arr, unsigned int maxLen) {
    
    unsigned int negLen = 0, posLen = 0;                    // negLen + posLen = maxLen

    float *neg, *pos;                                 //negative array and positive array of floats
    neg = (float *)malloc(maxLen * sizeof(float));
    pos = (float *)malloc(maxLen * sizeof(float));
    
    //divides all input into two arrays : negatives and non-negatives
    for(int i = 0 ; i < maxLen ; i++){
        if(arr[i]<0){
            neg[negLen] = arr[i];
            negLen++;
        }
        else{
            pos[posLen] = arr[i];
            posLen++;
        }
    }
    
    radixSort((unsigned int *) neg, &negLen);                                 //sorts negative array
    radixSort((unsigned int *) pos, &posLen);                                 //sorts positive array
    
    int j = 0;
    for(int i = negLen-1 ; i > -1 ; i--, j++){                      //negative order must be reversed
        arr[j] = neg[i];
    }
    for(int k = 0; k < posLen ; k++, j++){
        arr[j] = pos[k];
    }
    
    free(neg);      //don't forget to free the memory you shmuck
    free(pos);      //don't forget to free the memory you shmuck
    
    return 0;
}


int main(int argc, const char * argv[]) {
    
    FILE *myFile;
    myFile = fopen(argv[1], "rb");
    if(myFile == NULL){
        printf("Error: File Argument Not Found\n");
        return 1;
    }
    
    fseek(myFile, 0, SEEK_END);                 //moves pointer to end of file to get size
    int fsize = ftell(myFile);                  //saves size
    int length = fsize / sizeof(float);         //calculates number of floats in file
    float *arr;                                 //creates an array pointer
    arr = (float *)malloc(fsize);               //allocates memory for arr equal to size of myFile
    fseek(myFile, 0, SEEK_SET);                 //returns file pointer to start of file
    
    fread(arr , sizeof(float), length, myFile); //copies file contents into array arr
    fclose(myFile);
    
    sort(arr, length);
    
    myFile = fopen(argv[1], "wb");
    fwrite(arr,sizeof(float), length, myFile);  //writes sorted data into file
    
    fclose(myFile);                             //closes myFile
    free(arr);          //don't forget to free the memory you shmuck
}
 
