////
//  1.c
//  HW_5
//
//  Created by Edel Enrico Barcenas on 4/22/21.
//  Copyright © 2021 Edel Enrico Barcenas. All rights reserved.
//
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

const int ROW_LEN = 4;
struct node *** board;
struct node * start;                     // 0 starting position


short checkArgs(int argc, const char * argv[]) {    // returns 1 if args are valid
    if(argc != 16){
        printf("ERROR: 16 args needed");
        return 0;
    }
    
    for(int i = 1; i < argc ; i++){
        if(!(atoi(argv[i]) < 16 && atoi(argv[i]) > -1)){
            printf("INPUT ERROR: '%d' invalid", atoi(argv[i]));
            return 0;
        }
    }
    
    return 1;
}

typedef struct node{
    struct node * top;
    struct node * bottom;
    struct node * left;
    struct node * right;
    int * pos = {0, 0};
    int * gol = {0, 0};
    int val;
} node;

void printBoard(struct node *** board, int rowLen){
    
    for( int i = 0 ; i < rowLen ; i++){
        for( int j = 0 ; j < rowLen ; j++){
            printf("%d:%d\t", board[i][j]->pos, board[i][j]->val);
        }
        printf("\n");
    }
}



int main(int argc, const char * argv[]) {

    board = (struct node***)malloc(sizeof(struct node)*ROW_LEN*ROW_LEN);
    
    if(!checkArgs(argc, argv)){
        return 5;
    }
    
    int argCount = 1;
    
    for( int i = 0 ; i < ROW_LEN ; i++){
        for( int j = 0 ; j < ROW_LEN ; j++){
            node * top;
            node * bottom;
            node * left;
            node * right;
            
            if(i == 0){
                top = NULL;
                bottom = board[i+1][j];
            }
            else if( i == ROW_LEN-1){
                bottom = NULL;
                top = board[i-1][j];
            }
            else{
                top = board[i-1][j];
                bottom = board[i+1][j];
            }
            
            if(j == 0){
                left = NULL;
                right = board[i][j+1];
            }
            else if( j == ROW_LEN-1){
                right = NULL;
                left = board[i][j-1];
            }
            else{
                left = board[i][j-1];
                right = board[i][j+1];
            }
            
            node temp = {top, bottom, left, right, argCount, atoi(argv[argCount])};
            board[i][j] = &temp;
            
            if(temp.val == 0){
                start = board[i][j];
            }
            argCount++;
        }
    }
    board[ROW_LEN-1][ROW_LEN-1]->pos = 0;
    
    printBoard(board, ROW_LEN);

    free(board);
    
    return 0;
}
