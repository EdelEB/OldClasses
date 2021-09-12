
public class GarbageTruck extends Truck
{
    private String purpose;
    
    public GarbageTruck(String make, String model, int year, double ton, String purp)
    {
        super(make,model,year,ton);
        purpose=purp;
    }
    
    public String getPurpose()
    {
        return purpose;
    }
    
    public String toString()
    {
        return super.toString()+"Purpose: "+purpose+"\n";   
    }
}
