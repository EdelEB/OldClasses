
public class Alphabet
{
    public static void Alphabet(String letter, int x)
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int loc = alphabet.indexOf(letter);
        int count = x;
        for(int i=0;i<x;i++)
        {
            System.out.print(letter+" ");
            for(int j=1;j<count;j++)
            {
                System.out.print(alphabet.substring(loc+j,loc+j+1)+" ");
            }
            System.out.println();
            count--;
        }
    }
}
