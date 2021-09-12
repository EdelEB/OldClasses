//
//  test.c
//  
//
//  Created by Edel Enrico Barcenas on 5/7/21.
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

int sort(float* arr, unsigned int maxLen) {
    
    unsigned int negLen = 0, posLen = 0;                    // negLen + posLen = maxLen

    float neg[maxLen], pos[maxLen];                                 //negative array and positive array of floats
    unsigned int *negArr = (unsigned int *) neg;                    //unsigned int representation of negative array
    unsigned int *posArr = (unsigned int *) pos;                    //unsigned int representation of positive array
    
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
    
    radixSort(negArr, &negLen);                                 //sorts negative array
    radixSort(posArr, &posLen);                                 //sorts positive array
    
    int j = 0;
    for(int i = negLen-1 ; i > -1 ; i--, j++){                      //negative order must be reversed
        arr[j] = neg[i];
    }
    for(int k = 0; k < posLen ; k++, j++){
        arr[j] = pos[k];
    }
    
    return 0;
}


int main(int argc, const char * argv[]) {
    
    FILE *myFile;
    myFile = fopen(argv[1], "rb");
    if(myFile == NULL){
        printf("Error: File Not Found");
        return 1;
    }
    
    fseek(myFile, 0, SEEK_END);                 //moves pointer to end of file to get size
    int fsize = ftell(myFile);                  //saves size
    int length = fsize / sizeof(float);         //calculates number of floats in file
    float arr[length];                          //creates an empty array of length
    fseek(myFile, 0, SEEK_SET);                 //returns file pointer to start of file
    
    fread(arr , sizeof(float), length, myFile); //copies file contents into array arr
    
    sort(arr, length);
    
    for(int i = 0 ; i < length ; i++){          //prints all elements of array arr
        printf("%f\n", arr[i]);
    }
    
    fclose(myFile);                             //closes myFile
}
