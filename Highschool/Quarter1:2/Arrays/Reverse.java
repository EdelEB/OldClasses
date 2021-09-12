import java.util.Scanner;
public class Reverse
{
    public static void Reverse()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter integer: ");
        int length = in.nextInt();
        
        int [] array = new int[length];
        
        System.out.println("Enter values: ");
        for(int i = 0; i<length; i++)
        {
            array[i]= in.nextInt();
        }
        
        System.out.println("Array 1: ");
        for(int i = 0; i<length; i++)
        {
            System.out.print(array[i]+"\t");
        }
        
        for(int i = 0; i<(length/2); i++)
        {
            int swap = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = swap;
        }
        
        System.out.println("\nReverse Array: ");
        for(int i = 0; i<array.length; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
}
