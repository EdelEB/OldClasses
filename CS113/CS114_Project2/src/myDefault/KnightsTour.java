package myDefault;

public class KnightsTour 
{
	public static int[][] board;
	public static int count = 1;
	
	public static void main(String[] args)
	{	
		board = new int[8][8];
//		showBoard();

		traverse(0,0);
		showBoard();
	}
	
	public static void traverse( int y, int x)
	{
		
		board[y][x]=count++;
//		showBoard();
		
		if(y+1<board.length&&x+2<board.length&&board[y+1][x+2]==0){
			traverse(y+1,x+2);
			if(board[y+1][x+2]!=0)
				return;
		}
		if(y+2<board.length&&x+1<board.length&&board[y+2][x+1]==0){
			traverse(y+2,x+1);
			if(board[y+2][x+1]!=0)
				return;
		}
		if(y+2<board.length&&x-1>=0&&board[y+2][x-1]==0){
			traverse(y+2,x-1);
			if(board[y+2][x-1]!=0)
				return;
		}
		if(y+1<board.length&&x-2>=0&&board[y+1][x-2]==0){
			traverse(y+1,x-2);
			if(board[y+1][x-2]!=0)
				return;
		}
		if(y-2>=0&&x+1<board.length&&board[y-2][x+1]==0){
			traverse(y-2,x+1);
			if(board[y-2][x+1]!=0)
				return;
		}		
		if(y-1>=0&&x+2<board.length&&board[y-1][x+2]==0){
			traverse(y-1,x+2);
			if(board[y-1][x+2]!=0)
				return;
		}		
		if(y-2>=0&&x-1>=0&&board[y-2][x-1]==0){
			traverse(y-2,x-1);
			if(board[y-2][x-1]!=0)
				return;
		}	
		if(y-1>=0&&x-2>=0&&board[y-1][x-2]==0){
			traverse(y-1,x-2);
			if(board[y-1][x-2]!=0)
				return;
		}		
		if(count==65){
			System.out.println("Tour Complete");
			return;
		}
		
		else{
//			System.out.println("Fail");
			//showBoard();
			board[y][x]=0;
			count--;
			
		}
		
	}
	
	public static void showBoard()
	{
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board.length;j++){
				System.out.print(board[i][j]+"\t");
			}
			System.out.println();
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------");
	}
	
	public static boolean testCompletion()
	{
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board.length;j++){
				if(board[i][j]==0)
					return false;
			}
		}
		return true;
	}
}























