//
//  two.c
//  HW_5
//
//  Created by Edel Enrico Barcenas on 4/16/21.
//  Copyright © 2021 Edel Enrico Barcenas. All rights reserved.
//

#include <stdio.h>
#include <getopt.h>
#include <stdlib.h>
#include <unistd.h>

int main(int argc, char** argv){
    
    int myargc = 1;         //tracks option location
    int option;
    int fLoc = 0;           // f parameter location
    int sLoc = 0;           // s parameter location
    if(argc > 0){
        while ((option = getopt(argc, argv, "cduf:s:")) != -1){
            switch (option){
                case 'c' :
                case 'd' :
                case 'u' :
                    printf("option: -%c\n", option);
                    break;
                case 'f' :
                    fLoc = myargc+1;
                    if(fLoc >= argc || argv[fLoc][0] == '-'){
                        printf("option -f needs a parameter\n");
                        break;
                    }
                    printf("option: [-%c %s]\n", option, argv[myargc+1]);
                    break;
                case 's' :
                    sLoc = myargc+1;
                    if(sLoc >= argc || argv[fLoc][0] == '-'){
                        printf("option -s needs a parameter\n");
                        break;
                    }
                    printf("option: [-%c %s]\n", option, argv[myargc+1]);
                    break;
                case ':' :
                    printf("option -%c needs parameter\n", optopt);
                    break;
                case '?':
                    printf("bad option: -%c\n", optopt);
                    break;
            }
            myargc++;
        }
    }
    else{
        printf("no arguments\n");
    }
    
    // handles file arguments
    int input = 1;                              //boolean : is input file?
    for(int i = argc-2 ; i < argc ; i++){
        if(argv[i][0] == '-' || sLoc == i || fLoc == i ){    //makes sure arg is not an option or option parameter
            continue;
        }
        else{
            if(input) {
                printf("file in: ");
                input = 0;
            }
            else {
                printf("file out: ");
            }
            
            printf("%s\n",argv[i]);
        }
    }
    
    return 0;
}
