import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
    private String[][] mat;


    public FancyWord(String s)
    {
        //size the matrix
        mat = new String[s.length()][s.length()];
        //use Arrays.fill() to fill in the matrix with spaces
        //mat.fill(" ");
        for(int r=0;r<mat.length;r++)
            for(int c=0;c<mat[r].length;c++)
                mat[r][c]="_";
        //use a for loop to load in the letters into the matrix
        for(int r=0;r<mat.length;r++)
            for(int c=0;c<mat[r].length;c++)
                mat[r][c]="_";
                
        for(int r
                
        for(int r=0;r<mat.length;r++)
            for(int c=0;c<mat[r].length;c++)
                if(mat[r][c].equals(" "))
                    mat[r][c]=s.substring(c,0);
                
        
    }

    public String[][] getArray()
    {
        return mat[][];
    }
    
    public String toString()
    {
        String output="";
        return output+"\n\n";
    }
}