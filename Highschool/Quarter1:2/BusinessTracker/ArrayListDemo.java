import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        Friends homies = new Friends();
        homies.addFriend("Jill", "Sampson");
        homies.addFriend("Mary", "Roberts");
        homies.displayFriends();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your friend&#39;s first name: ");
        String firstName = in.nextLine();
        System.out.print("Enter your friend&#39;s last name: ");
        String lastName = in.nextLine();
        if (homies.findFriend(firstName, lastName))
        {
            System.out.println(firstName + ""+ lastName + "was found");
        }
        else
        {
            System.out.println(firstName + ""+ lastName + "was not found");
        }
        System.out.println("Your friend with the longest name is: "+

            homies.findFriendWithLongestLastName());
    }// end of main method
}// end of client class