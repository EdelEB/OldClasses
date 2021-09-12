
public class Car extends Vehicle implements Comparable
{
    private int mpg;
    
    public Car(String make, String model, int year,int miles)
    {
        super(make,model,year);
        mpg=miles;
    }
    
    public int getMPG()
    {
        return mpg;
    }
    
    public int compareTo(Object other)
    {
        if(((Car)other).getMPG()>getMPG())
            return -1;
        else if(((Car)other).getMPG()<getMPG())
            return 1;
        else
            return 0;
    }
    
    public String toString()
    {
        return super.toString()+"MPG: "+mpg+"\n";
    }
}
