package myDefault;

import java.util.Scanner;

		//(x>y>z)
		//(x<0 && y<0)
		//(x!<0 && y!<0)
		//(x==y && x!=z)

public class Main
{
	public static void main(String[] args)
	{
		
		//deanList();
		
		//salaryRaise();
		
		twoPowers();
		
		
		
	}
	
	public static void deanList()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("What's your GPA? ");
		double gpa = in.nextDouble();
		
		if(gpa>=3.5)
		{
			System.out.println("You're on the Dean's List");
		}
		System.out.println("You're too dumb for the Dean's List");

	}
	
	public static void salaryRaise()
	{
		Scanner in = new Scanner(System.in);
		
		double currentSalary; // current annual salary
		double rating; // performance rating
		double raise; // dollar amount of the raise
		System.out.print ("Enter the current salary: ");
		currentSalary = in.nextDouble();
		System.out.print ("Enter the performance rating: ");
		rating = in.nextInt();
		
		if(rating == 1)
		{
			raise = currentSalary*0.06;
		}
		else if(rating == 2)
		{
			raise = currentSalary*0.04;
		}
		else if(rating == 3)
		{
			raise = currentSalary*0.015;
		}
		else
		{
			System.out.println("Raise could not be calculated");
			raise = 0;
		}
		
		System.out.println ("Amount of your raise: $" + raise);
		System.out.println ("Your new salary: $" + (currentSalary + raise));

	}
	
	public static void twoPowers()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("How many powers of two do you want? ");
		
		int x = in.nextInt();
		int value = 2;
		while(x>1)
		{
			value *= 2;
			x--;
		}
		System.out.println(value);
	}
}
	

