package myDefault;

public class Main 
{
	public static void main(String[] args) 
    {
        int [] arr = triangle(10);
        for(int x: arr)
        {
        	System.out.println(x);
        }
    }

    public static int[] triangle(int n) 
    {
    	int [] arr = new int [n];
        
    	for(int i = 0; i<arr.length; i++)
    	{
    		arr[i] = pascal(i, n-1);
    	}
    	
    	return arr;
    }
    
    public static int pascal(int a, int b)
    {
    	if(a==b||a==0)
    	{
    		return 1;
    	}
    	else
    	{
    		return pascal(a-1, b-1) + pascal(a-1, b);
    	}
    }
}

















