
public class ForEach
{
    public static void main()
    {
        int[] a={1,5,3,6,7};
        printArray(a);
        
        for(int x:a)
        {
            x=99;
            System.out.print(x+" ");
        }
        System.out.println();
        
        printArray(a);
    }
    
    public static void printArray(int [] x)
    {
        for(int i=0; i<x.length;i++)
        {
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
}
