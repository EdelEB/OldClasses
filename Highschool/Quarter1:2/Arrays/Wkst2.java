
public class Wkst2
{
    public static void replaceAll(int [] numbers, int num)
    {
        for(int i = 0; i<numbers.length; i++)
        {
            if((i%2==0)&&(numbers[i]==num))
            {
                    numbers[i]=3;
            }
        }
        
        for(int i = 0; i<numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
    
    public static void lastWord(String [] names)
    {
        System.out.println(names[names.length-1].substring(0,names[names.length-1].length()-1));
    }
}
