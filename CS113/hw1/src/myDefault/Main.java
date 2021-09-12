
// Edel Barcenas
// CS 113 006
// HW1
// 2/7/19

package myDefault;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("2.5 Inches to Feet:\n\tEnter Inches: ");
		int temp = in.nextInt();
		System.out.println("\t"+in2ft(temp)+" ft");
		
		System.out.print("2.6 Grams to Pounds:\n\tEnter Grams: ");
		temp = in.nextInt();
		System.out.println("\t"+g2lb(temp)+" lbs");
		
		System.out.print("2.8 Killograms, Grams, Milligrams to Milligrams:\n\tEnter Killograms: ");
		int kgVal = in.nextInt();
		System.out.print("\tEnter Grams: ");
		int gVal = in.nextInt();
		System.out.print("\tEnter Milligrams: ");
		int mgVal = in.nextInt();
		System.out.println("\t"+kg_g_mg2mg(kgVal,gVal,mgVal)+" mg");
		
		System.out.print("2.9 Milligrams to Killigrams,Grams,Milligrams:\n\tEnter Milligrams: ");
		temp = in.nextInt();
		System.out.println("\t"+mg2kg_g_mg(temp));
		
		in.close();
		
		
	}
	
	public static double in2ft(int inchVal)
	{
		return inchVal/12.0;
	}
	
	public static double g2lb(double gVal)
	{
		return gVal/453.592;
	}
	
	public static int kg_g_mg2mg(int kgVal, int gVal, int mgVal)
	{
		int newVal = 0;
		newVal += kgVal*1000000;
		newVal += gVal*1000;
		newVal += mgVal;
		return newVal;
	}
	
	public static String mg2kg_g_mg(int mgVal)
	{
		int kg = mgVal/1000000;
		int g = mgVal%1000000/1000;
		int mg = mgVal%1000000%1000;
		return kg+"kg "+g+"g "+mg+"mg";
		
	}
	
}

