import java.awt.*;

public class AppleTester
{
    public static void main()
    {
        Apple a1 = new Apple("MacIntosh",Color.RED,5);
        Apple a2 = new Apple("GrannySmith",Color.GREEN,3);
        
        int result = a1.compareTo(a2);
        
        if(result==1)
            System.out.println(a1.getVariety()+" is lighter than "+a2.getVariety());
        else if(result==0)
            System.out.println(a1.getVariety()+" weighs the same as "+a2.getVariety());
        else if(result==-1)
            System.out.println(a1.getVariety()+" is heavier than "+a2.getVariety());
    }
}
