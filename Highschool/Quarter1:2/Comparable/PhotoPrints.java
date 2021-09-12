public class PhotoPrints implements PhotoCenter
{
    private int numPrints;
    private double costPerPrint;
    
    public PhotoPrints(int numPrints)
    {
        this.numPrints = numPrints;
        costPerPrint = .22;
    }
    
    public String getType()
    {
        return "Photo Prints";
    }
    
    public double getCost()
    {
        return costPerPrint*numPrints;
    }
}