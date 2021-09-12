import java.util.*;

public class Worksheet_3
{
    public static int addLengthExcepts(ArrayList<String> list)
    {
        int count = 0;
        
        for(int i=0;i<list.size();i++)
        {
            boolean bool = false;
            for(int j=0;j<list.get(i).length();j++)
            {
                if(list.get(j).substring(j,j+1).equals("n"))
                    bool=true;
            }
            
            if(!(list.get(i).substring(0,1).equals("s")||bool))
            {
                count += list.get(i).length();
            }
        }
        
        return count;
    }
    
    public static String findMin(ArrayList<Person> list)
    {
        int min = 1000000000;
        int pos = 0;
        
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getAge()<min)
            {
                min=list.get(i).getAge();
                pos = i;
            }
        }
        
        return list.get(pos).getName();
    }
    
    public static void removeFirstLettersAndInsertFun(ArrayList<String> list)
    {
        for(int i=0; i<list.size(); i++)
        {
            String temp = "fun"+list.get(i).substring(1);
            list.remove(i);
            list.add(i,temp);
        }
    }
}
