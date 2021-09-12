import java.util.*;

public class Grid
{
    private String[][] grid;
    private String[] vals;
   
    //load vals into the rows x cols grid randomly
    public Grid(int rows, int cols, String[] vals)
    {       
        grid = new String[rows][cols];
        this.vals=vals;
        
        for(int r=0;r<rows;r++)
            for(int c=0;c<cols;c++)
            {
                grid[r][c]=vals[(int)(Math.random()*vals.length)];
            }
    }

    //find out which of the vals occurs the most
    public String findMax()
    {
        int count=0;
        String output="";
        for(int i=0; i<vals.length;i++)
        {
            for(int r=0;r<grid.length;r++)
                for(int c=0;c<grid[r].length;c++)
                    if(vals[i].equals(grid[r][c]))
                    {    
                        count++;
                    }
            output+="There are "+count+" "+vals[i]+"\n";
            count=0;
        }
        return output;
    }

    //returns a count of how many times val occurs in the matrix
    private int countVals( String val )
    {
        int count=0;
        for(int r=0;r<grid.length;r++)
            for(int c=0;c<grid[r].length;c++)
            {
                if(grid[r][c].equals(val))
                    count++;
            }
        return 0;
    }

    //display the grid
    public String toString()
    {
        String output="";
        for(String[] a: grid)
        {
            for(String b: a)
            {
                output+=(b+" ");
            }
            output +="\n";
        }
        return output;
    }
}