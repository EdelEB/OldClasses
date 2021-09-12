import java.util.*;

public class PirateParrot extends Parrot
{   
    public PirateParrot(String n)
    {
        super(n);
    }
    
    public void stealSoul(int a)
    {
        age+=a;
    }
    
    public void train(String s)
    { 
        super.train(s);
    }
}