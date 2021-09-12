
public class Holiday extends Cards
{
    public Holiday(String n)
    {
        super(n);
        cost=1;
    }
    
    public Holiday(String n, double c)
    {
        super(n,c);
    }
    
    public String greeting()
    {
        return "Dear "+super.getRecipient()+". Happy Holidays\n"+super.costPhrase();
    }
}
    