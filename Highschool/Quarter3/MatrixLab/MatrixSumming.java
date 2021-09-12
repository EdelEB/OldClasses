import java.util.*;
import java.io.*; 

public class MatrixSumming
{
    public int[][] matrix = {{1,2,3,4,5}, //0
                             {6,7,8,9,0}, //1
                             {6,7,1,2,5}, //2
                             {6,7,8,9,0}, //3
                             {5,4,3,2,1}};//4
                            //0,1,2,3,4
    public MatrixSumming(){}
                            
    public int sum(int r, int c)
    {
        int sum=0;
        if(c>0&&r>0)
            sum+=matrix[r-1][c-1];
        if(r>0)
            sum+=matrix[r-1][c];
        if(r>0&&c<matrix[r].length-1)
            sum+=matrix[r-1][c+1];
        if(c>0)
            sum+=matrix[r][c-1];
        sum+=matrix[r][c];    
        if(c<matrix[r].length-1)
            sum+=matrix[r][c+1];
        if(r<matrix.length-1&&c>0)
            sum+=matrix[r+1][c-1];
        if(r<matrix.length-1)
            sum+=matrix[r+1][c];
        if(r<matrix.length-1&&c<matrix[r].length-1)
            sum+=matrix[r+1][c+1];
        return sum;
    }

    public String toString()
    {
        return "2,2 : "+sum(2,2)+"\n0,0 : "+sum(0,0)+"\n4,3 : "+sum(4,3)+"\n4,4 : "
                                +sum(4,4)+"\n2,4 : "+sum(2,4)+"\n1,3 : "+sum(1,3);
    }
}