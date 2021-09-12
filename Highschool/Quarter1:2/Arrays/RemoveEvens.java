import java.util.*;

public class RemoveEvens
{
    public static void main()
    {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i=0; i<20; i++)
        {
            array.add((int)(Math.random()*100)+1);
        }
        
        for(int i=0; i<array.size(); i++)
        {
            System.out.print(array.get(i)+" " );
        }
        
        System.out.println();
        
        for(int i=0; i<array.size(); i++)
        {
            if(array.get(i)%2==0)
            {
                array.remove(i);
                i--;
            }
        }
        
        for(int i=0; i<array.size(); i++)
        {
            System.out.print(array.get(i)+" " );
        }
    }
}
