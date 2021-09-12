//  1.c
//  HW_5
//
//  Created by Edel Enrico Barcenas on 4/22/21.
//  Copyright © 2021 Edel Enrico Barcenas. All rights reserved.
//

//  I have run out of time.
//  This program does not work as intended and is unfinished. It is only capable of solving some 15 puzzles
//  and runs into a seg fault (presumably stack overflow) when it can't find it
//  Saving the optimal path is not yet possible because the it cannot even solve the puzzle consistently.


#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

const int ROW_LEN = 4;
int board[4][4];
int start[2];          // (row, col)
int step = 0;

typedef struct node{    //this was intended to be used once the algorithm could consistently solve the puzzle
    struct node * prev;
    struct node * next;
    int dir;       //saves the direction of a move
} node;            //at the end, running through the linked list would give you a list of all moves directions



short checkArgs(int argc, const char * argv[]) {    // returns 1 if args are valid
    if(argc == ROW_LEN*ROW_LEN){
        printf("ERROR: Wrong Number of Args");
        return 0;
    }
    
    for(int i = 1; i < argc ; i++){
        if(!(atoi(argv[i]) < ROW_LEN*ROW_LEN && atoi(argv[i]) > -1)){
            printf("INPUT ERROR: '%d' invalid", atoi(argv[i]));
            return 0;
        }
    }
    return 1;
}



void printBoard(int board[4][4], int rowLen){   // prints 2D int array board
    for( int i = 0 ; i < rowLen ; i++){
        for( int j = 0 ; j < rowLen ; j++){
            printf("%d\t", board[i][j]);
        }
        printf("\n");
    }
    printf("\n-----------------------------------------------------------------------%d\n", step);
}



int getRow(int val){    // returns the row goal state of val
    switch (val) {
        case 1:
        case 2:
        case 3:
        case 4:
            return 0;
        case 5:
        case 6:
        case 7:
        case 8:
            return 1;
        case 9:
        case 10:
        case 11:
        case 12:
            return 2;
        case 13:
        case 14:
        case 15:
        case 0:
            return 3;
        default:
            return 999;
    }
}

int getCol(int val){    //returns column goal state of val
    switch (val) {
        case 1:
        case 5:
        case 9:
        case 13:
            return 0;
        case 2:
        case 6:
        case 10:
        case 14:
            return 1;
        case 3:
        case 7:
        case 11:
        case 15:
            return 2;
        case 4:
        case 8:
        case 12:
        case 0:
            return 3;
        default:
            return 999;
    }
}



int inGoal(int row, int col, int val){ //returns 1 if value is in its goal position
    if( row == getRow(val) && col == getCol(val))
        return 1;
    return 0;
}



int calcH(int row, int col, int val){ //calculates manhatten distance
    return abs(row - getRow(val)) + abs(col - getCol(val));
}



void moveDir(int r1, int c1, int dir){ // swaps value at (r1, c1) with int in direction dir { -1:left, 1:right, 2:up, -2:down }
    int r2 = r1;
    int c2 = c1;
    
    switch (dir) {
        case -1:
            c2--;
            break;
        case 1:
            c2++;
            break;
        case 2:
            r2--;
            break;
        case -2:
            r2++;
            break;
        default:
            printf("Error in \"moveDir\": dir input invalid\n");
            return;
    }
    
    int temp = board[r1][c1];
    board[r1][c1] = board[r2][c2];
    board[r2][c2] = temp;
    
    printBoard(board, ROW_LEN);
}



int isSolved(){ // returns 1 when board is solved, 0 when it is not
    for( int i = 0 ; i < ROW_LEN ; i++){
        for( int j = 0 ; j < ROW_LEN ; j++){
            if( !(inGoal(i, j, board[i][j])) ){
                return 0;
            }
        }
    }
    return 1;
}



int solve(int row, int col, int prev, int prevNext){   // prev gives either {-1,1,2,-2} meaning {left, right, up, down}
    //check base case
    if(isSolved()){
        return 1;
    }
    
    // run solve
    int size = 0;
    int lH[4] = {-99,0, row, col-1}; // left H | Format: (direction num, H value, newRow, newCol)
    int rH[4] = {-99,0, row, col+1}; // right H
    int uH[4] = {-99,0, row-1, col}; // up H
    int dH[4] = {-99,0, row+1, col}; // down H
    //Sets directional values and their new H's for rankings
    if (col > 0 && prev != -1){ //left
        lH[0] = -1;
        lH[1] = calcH(row, col, board[row][col-1]) + calcH(row, col-1, 0) + step;
        size++;
    }
    if (col < ROW_LEN-1 && prev != 1){ // right
        rH[0] = 1;
        rH[1] = calcH(row, col, board[row][col+1]) + calcH(row, col+1, 0) + step;
        size++;
    }
    if (row > 0 && prev != 2){
        uH[0] = 2;
        uH[1] = calcH(row, col, board[row-1][col]) + calcH(row-1, col, 0) + step;
        size++;
    }
    if (row < ROW_LEN-1 && prev != -2)    {
        dH[0] = -2;
        dH[1] = calcH(row, col, board[row+1][col]) + calcH(row+1, col, 0) + step;
        size++;
    }
    
    //Create and Populate Search Order Array
    int count = 0;
    int order[size][4];            // Order of directions to be searched
    
    if(lH[0] != -99){                   //I probably could've made a function to copy these tuples
        for(int i = 0; i < 4; i++){     //but I didn't want to risk it. This HW is painful as is
            order[count][i] = lH[i];    //So many Segmentation Faults  AAAAAAARRRGGGH. I am losing my sanity
        }
        count++;
    }
    if(rH[0] != -99){
        for(int i = 0; i < 4; i++){
            order[count][i] = rH[i];
        }
        count++;
    }
    if(uH[0] != -99){
        for(int i = 0; i < 4; i++){
            order[count][i] = uH[i];
        }
        count++;
    }
    if(dH[0] != -99){
        for(int i = 0; i < 4; i++){
            order[count][i] = dH[i];
        }
        count++;
    }
    
    //sort order[][] using bubble sort
    for(int i = 0 ; i < size-1 ; i++){
        for(int j = 0 ; j < size-i-1 ; j++){
            if(order[j][1] > order[j+1][1]){    //this is my obnoctious sort loop becuase making a seperate
                for(int temp, k = 0; k < 4; k++){     //function gives segmant faults or bus errors
                    temp = order[j][k];
                    order[j][k] = order[j+1][k];
                    order[j+1][k] = temp;
                }
            }
        }
    }
    
    //calls solve() in order of most efficient path (determined by projected H vals)
    for(int i = 0 ; i < size ; i++){
        if(order[i][1] > prevNext){return 0;} // returns 0 if path is less efficient than prevNext Path
        
        moveDir(row, col, order[i][0]);    //makes move from current row and col in direction of order element
        step++;
        
        int nextShort;                          //next shortest path value from this solve() call
        if( i == size-1){nextShort=99999999;}       //on the current shortest path (no other paths)
        else{nextShort = order[i+1][1];}
        if( solve(order[i][2], order[i][3], -(order[i][0]), nextShort)){  //attempts to solve from new position
            return 1;
        }
        printf("????????????????????????????????????????????????????????\n");
        // this code is not being hit. step never decreased. I think there is an infinite loop somewhere
        step--;                             //else : goal state could not be reached through that path
        moveDir(row, col, order[i][0]);    //undoes move
    }
    return 0;
}

int main(int argc, const char * argv[]) {
    if(!checkArgs(argc, argv)){ return 5; }
    
    int argCount = 1;
    for( int i = 0 ; i < ROW_LEN ; i++){
        for( int j = 0 ; j < ROW_LEN ; j++){
            int currArg = atoi(argv[argCount]);
            board[i][j] = currArg;
            if(currArg == 0){           // when '0' arg is found, (row, col) is saved into start[];
                start[0] = i;
                start[1] = j;
            }
            argCount++;
        }
    }
    
    printBoard(board, ROW_LEN);
    step++;
    
    if(solve(start[0], start[1], 999, 999)){
        printf("Solved\n");
    }
    else{
        printf("Could Not Solve\n");
    }
    
    return 0;
}
