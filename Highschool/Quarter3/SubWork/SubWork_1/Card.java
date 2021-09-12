//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 


public abstract class Card
{
    public static final String FACES[] = {"Joker","ACE","TWO","THREE","FOUR",
            "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

    public String suit;
    public int face;

    //constructors
    public Card()
    {
        face=0;
        suit="";
    }
    
    public Card(int f, String s)
    {
        face=f;
        suit=s;
    }

    // modifiers
    public void setFace(int f)
    {
        face=f;
    }

    public void setSuit(String s)
    {
        suit=s;
    }

    //accessors
    public String getFace()
    {
        return FACES[face];
    }
    
    public String getSuit()
    {
        return suit;
    }

    public abstract int getValue();

    public boolean equals(Object obj)
    {
        if(getFace().equals((((Card)obj).getFace()))&&(suit.equals(((Card)obj).getSuit())))
            return true;
        return false;
    }

    //toString
    public String toString()
    {
        return getFace()+" of "+suit+" | "+getValue();
    }
 }