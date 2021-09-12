package myDefault;

import java.util.Random;
import java.util.Scanner;

public class MyMethods 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a length, width, and depth: ");
		int length = in.nextInt();
		int width = in.nextInt();
		int depth = in.nextInt();
		System.out.println("Total surface area = "+surface(length,width,depth));
		
		System.out.println("Enter a right triangles first side and hypotenuse: ");
		double sideA = in.nextDouble();
		double hypotenuseB = in.nextDouble();
		System.out.println("Last side: "+rightTriangle(sideA,hypotenuseB));
		
		System.out.print("Enter die1 color: ");
		Die die1 = new Die(in.nextLine());
		System.out.print("Enter die2 color: ");
		Die die2 = new Die(in.nextLine());
		System.out.println("Combo of die1: "+die1+", and die2: "+die2+" is "+comboDie(die1,die2));
		
		System.out.print("Enter a color for each of your die in a new pair: ");
		Die die3 = new Die(in.nextLine());
		Die die4 = new Die(in.nextLine());
		PairOfDice set1 = new PairOfDice(die3,die4);
		System.out.print(set1);
		
	}
	
	public static Die comboDie(Die die1, Die die2)
	{
		
		Die newDie = new Die("color undetermined");
		newDie.setColor(die1.getColor()+" "+die2.getColor());
		newDie.setFace((die1.getFace()+die2.getFace())/2);
		return newDie;
	}
	
	public static int surface(int length, int width, int depth)
	{
		return length*width*2 + length*depth*2 + width*depth*2;
	}
	
	public static double rightTriangle(double sideA, double hypotenuseB)
	{
		return Math.sqrt(hypotenuseB*hypotenuseB - sideA*sideA);
	}	
}

class Die 
{
    public Die(String color) 
    {
        this.color = color;
    	roll();
    }
    
    public Die() 
    {
        color = "default white";
    	roll();
    }

    public String getColor()
    {
    	return color;
    }
    
    public int getFace() 
    {
        return face;
    }

    public void roll() 
    {
        face = rand.nextInt(MAX_FACE) + 1;
    }

    public void setColor(String newColor)
    {
    	color = newColor;
    }
    
    public void setFace(int value) 
    {
        if (1 <= value && value <= MAX_FACE) 
        {
            face = value;
        }
    }

    public String toString() 
    {
        return color+" "+face;
    }

    private Random rand = new Random();

    private static final int MAX_FACE = 6;
    private int face;
    private String color;
}

class PairOfDice
{
	public PairOfDice(Die die1, Die die2)
	{
		this.die1 = die1;
		this.die2 = die2;
	}
	
	public Die getDie1()
	{
		return die1;
	}
	
	public Die getDie2()
	{
		return die2;
	}
	
	public int pairSum()
	{
		return die1.getFace()+die2.getFace();
	}
	
	public void roll()
	{
		die1.roll();
		die2.roll();
	}
	
	public void setDie1(Die newDie)
	{
		die1 = newDie;
	}
	
	public void setDie2(Die newDie)
	{
		die2 = newDie;
	}
	
	public String toString()
	{
		return die1+" and "+die2+" have a value of "+pairSum();
	}
	
	private Die die1;
	private Die die2;
}