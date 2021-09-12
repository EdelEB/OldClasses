import java.util.*;

public class Grades
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
  
        System.out.print("How many tests are you taking?    ");
        int testnum = in.nextInt();
        System.out.println();
        
        double average=0;
        int[] scores = new int[testnum];
        
        for(int i=0; i<testnum; i++)
        {
            System.out.print("Test "+(i+1)+": ");
            scores[i]=in.nextInt();
            average+=scores[i];
        }
        
        System.out.println();
        
        average=average/(double)testnum;
        
        for(int i=0; i<testnum; i++)
        {
            System.out.println("Test "+(i+1)+": "+scores[i]);
        }
        System.out.println("Average: "+average);
    }
}
