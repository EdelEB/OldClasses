//
//  main.cpp
//  KnightsTour
//
//  Created by Edel Enrico Barcenas on 5/28/20.
//  Copyright © 2020 Edel Enrico Barcenas. All rights reserved.
//

#include <iostream>
using namespace std;

int move = 1;
int board[8][8] = {{0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0}};

bool findTour(int x, int y){
    if(::move > 64){
        return true;
    }
    else if(x >= 8 | y >= 8 | x < 0 | y < 0){
        return false;
    }
    else if(board[x][y] != 0){
        return false;
    }
    else{
        board[x][y] = ::move;
        ::move += 1;
        
        
        if(findTour(x + 2, y + 1)){
            return true;
        }
        else if(findTour(x - 2, y + 1)){
            return true;
        }
        else if(findTour(x - 2, y - 1)){
            return true;
        }
        else if(findTour(x - 1, y - 2)){
            return true;
        }
        else if(findTour(x + 2, y - 1)){
            return true;
        }
        else if(findTour(x + 1, y + 2)){
            return true;
        }
        else if(findTour(x + 1, y - 2)){
            return true;
        }
        else if(findTour(x - 1, y + 2)){
            return true;
        }
        else{
            ::move -= 1;
            board[x][y] = 0;
            return false;
        }
    }
    
}

int main() {
    if(findTour(0,7)){
        cout<<"Tour Found\n";
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                cout<<board[i][j]<<" ";
            }
            cout<<endl;
        }
    }
    else{
        cout<<"No Tour"<<endl;
    }
    return 0;
}
