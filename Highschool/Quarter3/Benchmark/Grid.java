
public class Grid
{

    
    public static void Grid(int row,int col)
    {
        String[][] grid;
        grid = new String[row][col];
        
        for(int r=0;r<grid.length;r++)
            for(int c=0;c<grid[r].length;c++)
            {
                int rand=(int)(Math.random()*10+1);
                    if(c>0&&grid[r][c-1]!=null)
                        grid[r][c]=null;
                    else if(rand==1)
                        grid[r][c]="|";
                    else if(rand<4)
                        grid[r][c]="/";
                    else if(rand<6)
                        grid[r][c]="\\\\";
            }
            
        for(int r=0;r<grid.length;r++)
        {
            System.out.println();
            for(int c=0;c<grid[r].length;c++)
            {
                System.out.print(grid[r][c]+" ");
            }
        }
    }
}
