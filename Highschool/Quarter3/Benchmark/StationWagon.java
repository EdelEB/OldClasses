public class StationWagon extends Car
{
    private String suspension;
    
    public StationWagon(String make, String model, int year,int miles,String sus)
    {
        super(make,model,year,miles);
        suspension=sus;
    }
    
    public String getSuspension()
    {
        return suspension;
    }
    
    public String toString()
    {
        return super.toString()+"Suspension: "+suspension+"\n";
    }
}