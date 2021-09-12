//Edel Barcenas
//Class: CS280 (Summer)
//Project 1: KnightsTour
//May 28
public class Main{
    
    int DIMENSIONS = 8;
    int[][] board = new int[DIMENSIONS][DIMENSIONS];
    int move = 1;
    
    public void Main(){
        if(findTour(0,7)){
            System.out.println("Tour Found");
            for(int i=0; i<DIMENSIONS; i++){
                for(int j=0; j<DIMENSIONS; j++){   
                    System.out.print(board[i][j]+" ");  
                }
                System.out.println();
            }
        }
        else
            System.out.println("No Tour");
    }
    
    public boolean findTour(int x, int y){
            if(move > DIMENSIONS * DIMENSIONS){
                return true;
            }
            else if(x >= DIMENSIONS | y >= DIMENSIONS | x < 0 | y < 0){
                return false;
            }
            else if(board[x][y] != 0){
                return false;
            }
            else{
                board[x][y] = move;
                move++;
                
                if(findTour(x + 2, y + 1))
                    return true;
                else if(findTour(x - 2, y + 1))
                    return true;
                else if(findTour(x - 2, y - 1))
                    return true;
                else if(findTour(x - 1, y - 2))
                    return true;
                else if(findTour(x + 2, y - 1))
                    return true;
                else if(findTour(x + 1, y + 2))
                    return true;
                else if(findTour(x + 1, y - 2))
                    return true;
                else if(findTour(x - 1, y + 2))
                    return true;
                else{
                    move--;
                    board[x][y] = 0;
                    return false;
                }
            }
    }
}

