
public class Potpie extends Food
{
    public Potpie()
    {
        super();
    }
    
    public Potpie(String p, int c)
    {
        super(p,c);
    }
    
    public String typeMeal()
    {
        return "Dinner";
    }
    
    public int getCalories()
    {
       return calories; 
    }
    
    public String toString()
    {
        return super.toString()+" Eat at "+typeMeal();
    }
}
