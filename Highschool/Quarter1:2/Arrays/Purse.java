import java.util.*;
// A Purse holds a collection of Coins
public class Purse
{
    private ArrayList<Coin> coins;

    public Purse()
    { 
        coins = new ArrayList<Coin>(); 
    }
    // adds aCoin to the purse
    public void add(Coin aCoin)
    {
        coins.add(aCoin);
    }
    // returns total value of all coins in purse
    public double getTotal()
    {
        double total = 0;
        for(int i=0; i<coins.size(); i++)
        {
            total += coins.get(i).getValue();
        }        
        return total;
    }
    // returns the number of coins in the Purse that matches aCoin
    // (both myName & myValue)
    public int count(Coin aCoin)
    {
        int count = 0;
        
        for(int i=0; i<coins.size(); i++)
        {
            if(coins.get(i).getValue() == aCoin.getValue() && coins.get(i).getName().equals(aCoin.getName()))
            {
                count++;
            }
        }     
        
        return count;
    }
    // returns the name of the Coin in the Purse that has the smallest value
    public String findSmallest()
    {
//        double min = coins.get(0).getValue();
        int count = 0;
        for(int i=1; i<coins.size(); i++)
        {
            if(coins.get(i).getValue() < coins.get(count).getValue())
            {
//                min = coins.get(i).getValue();
                count = i;
            }
        }
        
        return coins.get(count).getName();
    }
}