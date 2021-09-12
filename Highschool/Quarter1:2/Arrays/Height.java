import java.util.*;
import java.text.DecimalFormat;
public class Height
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double[] heightArray = {19.6, 29.8, 34.2, 37.5, 40.3, 43, 45.5, 48, 50.4, 52.5, 54.5};
        printArray(heightArray);
        for (int x = 0; x < heightArray.length; x++)
        {
            System.out.print("What is the child's height at age " + x + ": ");
            double height = scan.nextDouble();
            adjustHeights(x, height, heightArray);
            printArray(heightArray);
        }
    }
    
    public static void printArray(double[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print("\n"+array[i]+"\t");
        }
        System.out.println();
    }
    
    public static void adjustArray(int a, double h, double[] array)
    {
        
    }
}