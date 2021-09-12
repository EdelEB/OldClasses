import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        Scanner keyboard2 = new Scanner(System.in);
        
        int size;
        String name;
        System.out.print("Enter 1st monster's name: ");
        name=keyboard.nextLine();
        System.out.print("Enter 1st monster's size: ");
        size=keyboard.nextInt();
        Monster mOne = new Skeleton(name, size);
        
        System.out.print("Enter 2nd monster's name: ");
        name=keyboard2.nextLine();
        System.out.print("Enter 2nd monster's size: ");
        size=keyboard2.nextInt();
        Monster mTwo = new Skeleton(name, size);
        
        if(mOne.isBigger(mTwo))
        {
            System.out.println("Monster one is bigger than monster two.");
        }
        if(mOne.isSmaller(mTwo))
        {
            System.out.println("Monster one is smaller than monster two.");
        }
        if(mOne.namesTheSame(mTwo))
        {
            System.out.println("Monster one has the same name as monster two.");
        }
		else
		  System.out.println("The Monsters have different names.");
	}
}