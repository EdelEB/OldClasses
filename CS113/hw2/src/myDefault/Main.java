// Edel Barcenas
// CS113 006
// HW2
// 2/11/19

package myDefault;

import java.util.Scanner;
import java.util.Random;

public class Main 
{
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("1.\nEnter First Name: ");
		String firstName = in.nextLine();
		System.out.print("Enter Last Name: ");
		String lastName = in.nextLine();
		
		System.out.println(nameGenerator(firstName,lastName));
		
		
		System.out.println("2.\nEnter 3 names: ");
		String name1 = in.nextLine();
		String name2 = in.nextLine();
		String name3 = in.nextLine();
		
		System.out.println(findAverage(name1, name2, name3));
		System.out.println(findInitials(name1, name2, name3));
		
		in.close();
		
	}
	
	public static double findAverage(String name1, String name2, String name3)
	{
		return (name1.length()+name2.length()+name3.length())/3.0;
	}
	
	public static String findInitials(String name1, String name2, String name3)
	{
		String initials = name1.substring(0,1)+name2.substring(0,1)+name3.substring(0,1);
		return initials;
	}
	
	public static String nameGenerator(String first,String last)
	{
		Random gen = new Random();
		
		String name = first.substring(0,1);
		if(last.length()<6)
		{
			name+=last;
		}
		else
		{
			name+=last.substring(0,5);
		}
		name+=(gen.nextInt(90)+10);
		return name;
	}
	
	
}
