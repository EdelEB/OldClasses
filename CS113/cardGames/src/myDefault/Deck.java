package myDefault;

import java.util.*;

public class Deck 
{
	public Deck()
	{
		shuffle();
	}
	
	
	public void shuffle()
	{
		cards = new ArrayList<Card>();
		
		for(int i=0; i<52; i++)
		{
			Card tempCard = new Card();
			
			boolean condition = true;
			while(condition)
			{
				for(int j = 0; j<cards.size(); j++)
				{
					if(tempCard.toString().equals(cards.get(j).toString()))
					{
						tempCard = new Card();
						j = 0;
					}
				}
				condition = false;
			}
			
			cards.add(tempCard);
		}
	}
	
	public String toString()
	{
		String returnString = "";
		
		for(Card x: cards)
			returnString += x+"\n";
		
		return returnString;
	}
	
	private ArrayList<Card> cards = new ArrayList<Card>();
	
}
