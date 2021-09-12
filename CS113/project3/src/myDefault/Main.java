package myDefault;

public class Main 
{
	static final int INTERVAL = 20;
	static int [] arr = new int[INTERVAL];
		
	public static void main(String [] args)
	{
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=i+1;
		}
		
		for(int x: arr)
		{
			System.out.print(x+"\t");
		}
		
		sieve(arr);
		System.out.println();
		
		for(int x: arr)
		{
			System.out.print(x+"\t");
		}
		
		System.out.println();
		int temp=0;
		for(int i = 4; i<=INTERVAL; i+=2)
		{
			for(int j: arr)
			{
				if(j!=0)
				{
					temp = i-j;
					if(arr[temp-1]==temp)
					{
						System.out.println(i+"("+j+", "+temp+")");
						break;
					}
				}
			}	
		}

	}
	
	public static void sieve(int [] array)
	{
		array[0]=0;
		for(int i=1; i<Math.sqrt(array.length); i++)
		{
			if(array[i]!=0)
			{
				for(int j=2*i+1; j<array.length; j+=(i+1))
				{
					array[j] = 0;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=array[i];
		}
	}
}
