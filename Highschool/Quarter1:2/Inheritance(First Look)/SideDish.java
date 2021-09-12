

public class SideDish extends Tuna
{
    double price;
    public SideDish(String s, int c, double p)
    {
        super(s,c);
        price=p;
    }
    
    public String toString()
    {
        return super.toString()+" Eat at "+super.typeMeal()+".Extra cost "+price;
    }
}
