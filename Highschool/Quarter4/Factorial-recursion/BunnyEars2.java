public class BunnyEars2
{
   public static int bunnyEars(int bunnies) 
    {
        if(bunnies==0)
            return 0;
        if(bunnies%2==0)
            return 3+bunnyEars(bunnies-1);
        return 2+bunnyEars(bunnies-1);
    }
}