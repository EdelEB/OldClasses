package myPackage;

import java.util.*;

public class Main 
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> nums= new ArrayList<Integer>();
		
		System.out.print("Input your first integer: ");
		nums.add(in.nextInt());
		
		System.out.print("Add another number (y/n): ");
		String MAKESHIFT_JAVA_BUG_FIX_1 = in.nextLine();
		String condition = in.nextLine();
		
		while(condition.equals("y"))
		{
			System.out.print("Input next integer: ");
			nums.add(in.nextInt());
			System.out.print("Add another number (y/n): ");
			String MAKESHIFT_JAVA_BUG_FIX_2 = in.nextLine();
			condition = in.nextLine();
		}
		
		for(int x: nums)
		{
			System.out.print(x+"\t");
		}
		System.out.println();
		System.out.println("Mean: "+getMean(nums));
		System.out.println("SD: "+getSD(nums));
	}
	
	public static double getMean(ArrayList<Integer> nums)
	{
		double mean = 0.0;
		double total = 0;
		
		for(int x: nums)
		{
			total += x;
		}
		
		mean = total/nums.size();
		
		return mean;
	}
	
	public static double getSD(ArrayList<Integer> nums)
	{
		double total = 0.0;
		
		for(int x: nums)
		{
			total += Math.pow(x-getMean(nums),2);
		}
		
		return Math.sqrt(total);
	}
	
}

















