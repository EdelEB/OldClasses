package myDefault;

import java.util.Random;

public class Main 
{
	public static void main(String [] args)
	{
		Random rand = new Random();
		
		int [] nums = new int [20];
		for(int i=0; i<nums.length; i++)
		{
			nums[i] = rand.nextInt(50)+1;
		}
		
		for(int x: nums)
		{
			System.out.print(x+"\t");
		}
		
		int [] temp = new int [20];
		
		for(int i=0; i<nums.length ; i++)
		{
			temp[i] = nums[nums.length-i-1];
		}
		
		for(int i=0; i<nums.length; i++)
		{
			nums[i] = temp[i];
		}
		
		System.out.println();
		for(int x: nums)
		{
			System.out.print(x+"\t");
		}
	}
}
