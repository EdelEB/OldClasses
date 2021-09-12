public class Poster implements PhotoCenter
{
    private double posterCost;
    
    public Poster()
    {
        posterCost = 4.50;
    }
    
    public String getType()
    {
        return "Poster";
    }
    
    public double getCost()
    {
        return posterCost;
    }
}