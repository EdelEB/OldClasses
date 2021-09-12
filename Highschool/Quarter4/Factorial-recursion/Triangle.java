public class Triangle
{
    public static int triangle(int rows) 
    {
        if(rows<1)
            return 0;
        return rows+triangle(rows-1);
    }
}