
public abstract class Cards
{
    private String name;
    double cost;
    
    public Cards(String n)
    {
        name=n;
        cost=1;
    }
    
    public Cards(String n, double c)
    {
        name=n;
        cost=c;
    }

    public abstract String greeting();
    
    public String getRecipient()
    {
        return name;
    }

    public String costPhrase()
    {
        return "Cost: "+cost;
    }
}
