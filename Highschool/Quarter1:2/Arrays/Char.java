import java.util.Scanner;

public class Char
{
    public static void Char()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String word = in.nextLine();
        //word = word.toUpperCase();
        
        char [] array= new char[word.length()];
        
        for(int i = 0; i<word.length(); i++)
        {
            array[i] = word.charAt(i);
        }
        
        for(int i = 0; i<array.length; i++)
        {
            System.out.println((i+1)+". "+array[i]+" "+(int)array[i]);
        }
    }
}
