//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class BlackJackCard extends Card
{
    
    //constructors  
    public BlackJackCard()
    {
        face=0;
        suit="";
    }
    
    public BlackJackCard(int f, String s)
    {
        super(f,s);
    }

    public int getValue()
    {
        //enables you to build the value for the game into the card
        //this makes writing the whole program a little easier
        if(face==1)
            return 11;
        else if(face<=10)
            return face;
        else if(face>10)
            return 10;

        return 100;
    }
 }