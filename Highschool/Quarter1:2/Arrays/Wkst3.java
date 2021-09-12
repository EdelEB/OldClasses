
public class Wkst3
{
    public static void main()
    {
        int[] b={2,4,6,8,10,12};
        //for (int count = 0; count<6;count++)
            ex2(b);
    }
    
    public static void ex2(int[] y)
    {
        for(int i=0;i<y.length;i++)
            System.out.print(y[i]);
    }
    
    public static void removeNeg(int[] x)
    {
        for(int i=0; i<x.length; i++)
        {
            if(x[i]<0)
                x[i]=0;
            else{}
            System.out.print(x[i]+" ");
        }
    }
    
    public static int linearSearch(int[] a, int t)
    {
        for(int i=0; i<a.length;i++)
        {
            if(a[i]==t)
                return 0;
            else{}
        }
        return -1;
    }
}
