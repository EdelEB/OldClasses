//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
import java.util.*;

public abstract class Card
{
    public static final String FACES[] = {"ACE","TWO","THREE","FOUR",
            "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
            
    public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};
    
    private String face;
    private String suit;
    private int value;
    
    //constructors
    public Card()
    {
        face=FACES[(int)(Math.random()*13)];
        suit=SUITS[(int)(Math.random()*4)];
        if(FACES[face]==0)
            value=11;
        else if(FACES[face]<9)
            value=(FACES[face]+1);
        else
            value=10;
    }

    public Card(String s)
    {
        face=FACES[(int)(Math.random()*13)];
        suit=s;
        if(FACES[face]==0)
            value=11;
        else if(FACES[face]<9)
            value=(FACES[face]+1);
        else
            value=10;
    }
    
    public Card(String f, String s)
    {
        face=f;
        suit=s;
        if(FACES[face]==0)
            value=11;
        else if(FACES[face]<9)
            value=(FACES[face]+1);
        else
            value=10;
    }

    // modifiers



    //accessors
    public String getFace()
    {
        return face;
    }
    
    public String getSuit()
    {
        return suit;
    }

    public String getValue()
    {
        return value;
    }

    public boolean equals(Object obj)
    {
        if(getFace().equals(((Card)obj).getFace())&&getSuit().equals(((Card)obj).getSuit()))
            return true;
        return false;
    }

    //toString
    public String toString()
    {
        return face+" of "+suit;
    }
 }