import static java.lang.System.*; 

public class Skeleton implements Monster
{
    String name;
    int size;
    
    public Skeleton()
    {
        name="null";
        size=0;
    }
    
    public Skeleton(String n, int s)
    {
        name=n;
        size=s;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public String getName()
    {
        return name;
    }
    
    public boolean isBigger(Monster other)
    {
        if(size>other.getSize())
            return true;
        return false;
    }
    
    public boolean isSmaller(Monster other)
    {
        if(size<other.getSize())
            return true;
        return false;
    }
       
    public boolean namesTheSame(Monster other)
    {
        if(name.equals(other.getName()))
            return true;
        return false;
    }
}