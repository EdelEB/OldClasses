import java.util.*;

public class QuizWritten
{
    public int countEvenLength(ArrayList<String> rayList)
    {
        int count = 0;
        
        for(int i=0; i<rayList.size(); i++)
        {
            if(rayList.get(i).length()%2==0)
                count++;
        }
        
        return count;
    }
    
    public static void removeStrings(char firstLetter)
    {
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("hello");
        list.add("howdy");
        list.add("edel");
        
        System.out.println(list);
        
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).charAt(0)==firstLetter)
            {
                list.remove(i);
                i--;
            }
        }
        
        System.out.print(list);
    }
    
    
    
    
}
