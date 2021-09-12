import java.util.*;

public class Worksheet_1

{
    public static int findPosition(int keyValue, ArrayList<Integer> list)
    {
        int a = -1;
        
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==keyValue)
            {
                a=i;
                break;
            }
        }
        
        return a;
    }
    
    public static int countMales(ArrayList<String> list)
    {
        int count = 0;
        
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).equals("male"))
            {
                count++;
            }
        }
        
        return count;
    }
    
    public static ArrayList<String> parseIntoArrayList(String input)
    {
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i=0;i<input.length();i++)
        {
            list.add(input.substring(i,(i+1)));
        }
        
        return list;
    }
}
