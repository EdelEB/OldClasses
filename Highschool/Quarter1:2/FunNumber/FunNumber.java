import java.util.*;

public class FunNumber
{
    private int myNum;
    public FunNumber(int n)
    {
        myNum = n;
    }
    
    public FunNumber(String n)
    {
        
    }
    
    public int sumDigits()
    {
        int number = myNum;
        int sum = 0;
        while (number > 0)
        {
            sum += number%10;
            number = number/10;
        }
        return sum;
    }
    
    public int numDigits()
    {
        int count = 0;
        int number = myNum;
        while(number > 0)
        {
            count++;
            number = number/10;
        }
        return count;
    }
    
    public boolean isPerfect()
    {
        ArrayList<Integer> perfect = new ArrayList<Integer>();
        int total = 0;
        for (int i = 1; i < myNum; i++)
        {
            if (myNum%i == 0)
                perfect.add(i);
        }
        for (int j = 0; j < perfect.size(); j++)
        {
            total += perfect.get(j);
        }
        if (total == myNum)
            return true;
        else
            return false;
    }
    
    public String reverseNum()
    {
        int number = myNum;
        int temp = 0;
        String word = "";
        while(number > 0)
        {
            temp = number%10;
            word += temp;
            number = number/10;
        }
        return word;
    }
}









