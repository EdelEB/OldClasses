package myDefault;

import java.util.Random;

public class MyClass
{
	public static void main(String[] args)
	{
		Random gen = new Random();
		
		int x = gen.nextInt(10)+1;
		System.out.print(x);
	}

}
