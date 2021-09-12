package myDefault;

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		int[] array = new int[5];
		array[2]=1;
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]);
		}
			/*		
		System.out.println(ack(1,2));
		String [] names = {"Monday","Tuesday", "Wednesday","Thursday","Friday", "Saturday", "Sunday"};
		int [] x = eStatistics(names);
		
		for(int i : x)
		{
			System.out.print(i+" ");
		}
		
		System.out.println(power(2,3));
	int [] a={1, 2, 3, 4, 5};
		System.out.println(recProd(a,4));
	
	
		
		int[] arr={1,0,1} ;
		 try {
		 for ( int i= 0 ; i <= arr.length ; i++ )
			 System.out.print( 1/arr[i] + " " );
		 }
		 catch(ArithmeticException e)
		 {
		 System.out.print("0");
		 }
		 catch (ArrayIndexOutOfBoundsException e)
		 {
		 System.out.print("out");
		 }
			
		
			
	}
	
	public static int recProd(int [] a, int places)
	{
		if(places == 1)
		{
			return a[0];
		}
		else
			return a[places-1]*recProd(a,places-1);
	}
	
	public static int [] eStatistics(String [] names)
	{
		int [] estats = new int[names.length];
		
		for(int i = 0; i<names.length; i++)
		{
			int count = 0;
			for(int j = 0; j<names[i].length(); j++)
			{
				if(names[i].substring(j,j+1).equals("e"))
				{
					count++;
				}
			}
			estats[i]=count;
		}
		return estats;
	}
	
	public static int power(int base, int expo)
	{
		if( expo == 0)
		{
			return 1;
		}
		else
		{
			return base*power(base, expo-1);
		}
		
	}
	
	public static int ack(int m, int n)
	{
		if(m==0)
			return (n+1);
		if(m>0 && n==0)
			return ack(m-1,1);
		if(m>0 && n>0)
			return ack(m-1,ack(m,n-1));
		return 0;
*/	}
	
}






