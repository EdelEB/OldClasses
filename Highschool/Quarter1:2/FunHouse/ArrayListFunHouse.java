import java.util.*;

public class ArrayListFunHouse
{
    public static ArrayList<Integer> getListOfFactors(int number)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=2;i<number;i++)
        {
            if (number%i==0)
                list.add(i);
        }
        
        return list;
    }
    
    public static void keepOnlyCompositeNumbers( List<Integer> nums )
    {
        for(int i=0; i<nums.size();i++)
        {
            if(getListOfFactors(nums.get(i)).size()==0)
            {
                nums.remove(i);
                i--;
            }
        }
    }
}