//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
    public static final int NUMFACES = 13;
    public static final int NUMSUITS = 4;
    public static final int NUMCARDS = 52;

    private int topCardIndex;
    private ArrayList<Card> stackOfCards;

    public Deck()
    {
        //initialize data - stackOfCards - topCardIndex
        while(stackOfCards.size()<52)
        {
            stackOfCards.add(new Card());
        }
    }

    //modifiers
    public void shuffl()
    {
        //shuffle the deck
        //reset variables as needed
    }

    //accessors
    public int  size()
    {
        return 0;
    }

    public int numCardsLeft()
    {
        return 0;
    }

    public Card nextCard()
    {
        return stackOfCards.get(topCardIndex--);
    }

    public String toString()
    {
        return stackOfCards + "   topCardIndex = " + topCardIndex;
    } 
}