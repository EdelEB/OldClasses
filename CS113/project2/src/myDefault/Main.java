package myDefault;

/*
 * Edel Barcenas
 *CS113-006
 *3/25/19
 *Project 2
*/

import java.util.Random;

public class Main 
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int areaSquare = 1;
		double r = 0.5;
		double areaCircle = 3.14 / 4;
		double probSquare = 1.0;
		double probCircle = 3.14 / 4;
		int count = 0;
		
		for(int i=0; i<1000000; i++)
		{
			double x = rand.nextDouble();
			double y = rand.nextDouble();
			if(-0.25 >= (Math.pow(x,2) - x + Math.pow(y,2)-y))
			{
				count++;
			}
		}
		double pi = (count/1000000.0)*4;
		System.out.println(pi);
	}
}
