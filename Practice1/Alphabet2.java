
public class Alphabet2
{
    public static void Alphabet2(String letter, int x)
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int loc = alphabet.indexOf(letter);
        int count = x;
        int count2 = 0;
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<count;j++)
            {
                if(loc+i>=alphabet.length())
                {
                    System.out.print(alphabet.substring(0+count2,count2+1)+" ");
                }
                else
                    System.out.print(alphabet.substring(loc+i,loc+i+1)+" ");
            }
            if(loc+i>=alphabet.length())
                    count2++;
            System.out.println();
            count--;
        }
    }
}
