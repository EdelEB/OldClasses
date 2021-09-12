import java.util.*;

public class Worksheet_2
{
    public static void removeZeros(ArrayList<Integer> list)
    {
        for(int i=0;i<list.size();i++)
        {
           if(list.get(i)==0)
           {
               list.remove(i);
               i--;
           }
        }
    }
    
    public static int countLetters(ArrayList<String> list)
    {
        int count = 0;
        
        for(int i=0;i<list.size();i++)
        {
            count = count + list.get(i).length();
        }
        
        return count;
    }
}
