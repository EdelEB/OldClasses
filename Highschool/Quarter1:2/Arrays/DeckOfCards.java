import java.util.Random;

public class DeckOfCards
{
    public static void main()
    {
        int [] deck = new int[52];
        //card rank
        int cr1=0,cr2=0,cr3=0,cr4=0;
        //card suit
        String cs1="",cs2="",cs3="",cs4="";
        //new rank
        String nr1="",nr2="",nr3="",nr4="";

        shuffle(deck);
            
        cs1 = findSuit(deck[0]);
        cs2 = findSuit(deck[1]);
        cs3 = findSuit(deck[2]);
        cs4 = findSuit(deck[3]);
        
        cr1 = findRank(deck[0]);
        cr2 = findRank(deck[1]);
        cr3 = findRank(deck[2]);
        cr4 = findRank(deck[3]);
        
        if (cr1>=9)
        {
           nr1 = checkRank(cr1);
           cr1 = -1;
        }
        if (cr2>=9)
        {
            nr2 = checkRank(cr2);
            cr2 = -1;
        }
        if (cr3>=9)
        {
            nr3 = checkRank(cr3);
            cr3 = -1;
        }
        if (cr4>=9)
        {
            nr4 = checkRank(cr4);
            cr4 = -1;
        }
        
        //print
        if(cr1==-1)
            System.out.println("First card: "+nr1+" of "+cs1);
        else
            System.out.println("First card: "+(cr1+2)+" of "+cs1);
        if(cr2==-1)
            System.out.println("Second card: "+nr2+" of "+cs2);
        else
            System.out.println("Second card: "+(cr2+2)+" of "+cs2);
        if(cr3==-1)
            System.out.println("Third card: "+nr3+" of "+cs3);
        else
            System.out.println("Third card: "+(cr3+2)+" of "+cs3);
        if(cr4==-1)
            System.out.println("Fourth card: "+nr4+" of "+cs4);
        else
            System.out.println("Fourth card: "+(cr4+2)+" of "+cs4);
    }

    public static void shuffle(int [] a)
    {
        for (int i = 0; i<a.length; i++)
        {
            a[i]=(int)(Math.random()*52);
            for (int j = 0; j<i; j++)
            {
                while(a[i]==a[j])
                {
                    a[i] = (int)(Math.random()*52);
                }
            }
        }
        return;
    }
    
    public static int findRank(int a)
    {
        int b = 0;
        b = a%13;
        return b;
    }
    
    public static String findSuit(int a)
    {
        int b = 0;
        b = a/13;
        if(b==0)
            return "Spades";
        else if (b==1)
            return "Hearts";
        else if (b==2)
            return "Diamonds";
        else if (b==3)
            return "Clubs";
        else
            return "Joker1";
    }
    
    public static String checkRank(int a)
    {
        if(a==9)
            return "Jack";
        else if(a==10)
            return "Queen";
        else if(a==11)
            return "King";
        else if(a==12)
            return "Ace";
        else
            return "Joker2";
    }
}
