public class TableTop implements PhotoCenter
{
    private String type;
    private double printPrice;
    
    public TableTop(String type)
    {
        this.type = type;
    }
    
    public String getType()
    {
        return type;
    }
    
    public double getCost()
    {
        if (type.equalsIgnoreCase("Aluminum"))
            return 11.50;
        else if(type.equalsIgnoreCase("Medallion"))
            return 13.50;
        else if (type.equals("Wood"))
            return 9.75;
        else
            return 25;
    }
}