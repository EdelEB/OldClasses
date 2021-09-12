//
//  main.c
//  HW_5
//
//  Created by Edel Enrico Barcenas on 4/14/21.
//  Copyright © 2021 Edel Enrico Barcenas. All rights reserved.
//
#include <stdio.h>
#include <ctype.h>

int main(int argc, const char * argv[]) {
		    
    printf("argv\t| %p | %p\n\n", argv, &argv);
    
    for(int i = 0; i < argc ; i++){
        printf("arg[%d]\t| %p | %p\n", i, argv[i], &argv[i]);
    }
    
    unsigned char *ptr = (unsigned char *)argv[0];
    
    int bytes = 0;
    printf("\t| ");
    while(ptr < (unsigned char *)argv[argc-1]+8 || bytes != 0){
            if( isprint(*ptr) ){
                printf("%02hhx(%c) ", *ptr, *ptr) ;
            }
            else{
                printf("00(\\0) ") ;
            }
        bytes++;
        if(bytes == 8){
            printf("\t| %p\n\t| ", &*(ptr-7));
            bytes = 0;
        }
        ptr++;
    }
    
    printf("\n");
/*
    for(int i = 0; i < argc ; i++){
        printf("\t | ");
        for(int j = 0 ; j < 8 ; j++){
            if( isprint(argv[i][j]) ){
                printf("%02hhx(%c) ", argv[i][j], argv[i][j]) ;
            }
            else{
                printf("00(\\0) ") ;
            }
        }
        printf("\t| %p\n", &argv[i]);
    }
 */
    
    return 0;

}
