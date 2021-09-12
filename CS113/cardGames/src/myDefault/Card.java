package myDefault;

import java.util.*;

public class Card
{
	public Card()
	{
		Random rand = new Random();
		
		int tempNum = rand.nextInt(13)+1;
		
		if(tempNum == 1 || tempNum>10)
		{
			determineFace(tempNum);
		}
		else
			number = tempNum;
		
		setSuit();
	}
	
	public Card(int number,String suit )
	{
		this.number = number;
		this.suit = suit;
	}
	
	public Card(String face, String suit)
	{
		this.face = face;
		this.suit = suit;
	}
	
	public void determineFace()
	{
		Random rand = new Random();
		int num = rand.nextInt(4)+1;
		
		if(num==1)
			face = "Ace";
		else if(num==2)
			face = "Jack";
		else if(num==3)
			face = "Queen";
		else if(num==4)
			face = "King";
		else
			face = "Error Determining Face";
	}
	
	public void determineFace(int num)
	{
		if(num==1)
			face = "Ace";
		else if(num==11)
			face = "Jack";
		else if(num==12)
			face = "Queen";
		else if(num==13)
			face = "King";
		else
			face = "Error: Determing Face";
	}
	
	public void setSuit()
	{
		Random rand = new Random();
		int temp = rand.nextInt(4)+1;
		if(temp==1)
			suit = "Spades";
		else if(temp==2)
			suit = "Hearts";
		else if(temp==3)
			suit = "Clubs";
		else if(temp==4)
			suit = "Diamonds";
		else
			suit = "Error: Setting Suit";
	}
	
	public void setSuit(String suit)
	{
		String tempSuit = suit.toLowerCase();
		if(suit.equals("spades") || suit.equals("hearts") || suit.equals("clubs") || suit.equals("diamonds"))
		{
			tempSuit = tempSuit.substring(0,1).toUpperCase() + tempSuit.substring(1);
			this.suit = tempSuit;
		}
		else
			setSuit();
		
	}
	
	public String toString()
	{
		if(face.equals("no face"))
			return number + " of " + suit;
		else
			return face + " of " + suit;
	}
	
	private int number = 0;
	private String suit;
	private String face = "no face";
}





















