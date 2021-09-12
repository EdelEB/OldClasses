

public class Truck extends Vehicle
{
    private double tonnage;
    
    public Truck(String make, String model, int year, double ton)
    {
        super(make,model,year);
        tonnage=ton;
    }
    
    public double getTonnage()
    {
        return tonnage;
    }
}
