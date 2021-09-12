java.util.*;

public class RandTwoDim
{
    public static void main()
    {
        int[][] mat = new int[3][4];
        
        for(int r=0;r<mat.length;r++)
            for(int c=0;c<mat[r].length;c++)
            {
                mat[r][c]=(int)(Math.random()*100+1);
            }
            
        for(int r=0;r<mat.length;r++)
            for(int c=0;c<mat[r].length;c++)
            {
                System.out.print(mat[r][c]+" ");
            }
        
        System.out.println();    
        System.out.println("Enhanced");
        for(int [] r: mat)
        {
            for(int num: r)
                System.out.print(num+" ");
        }
        
        System.out.println();
        System.out.println("Arrays.toString");
        for(int r=0;r<mat.length;r++)
            System.out.print
    }
}
