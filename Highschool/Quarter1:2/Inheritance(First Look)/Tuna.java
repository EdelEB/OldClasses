
public class Tuna extends Food
{
    public Tuna()
    {
        super(); 
    }

    public Tuna(String t, int c)
    {
        super(t,c);
    }
    
    public String typeMeal()
    {
        return "Lunch";
    }
    
    public int getCalories()
    {
        return calories;
    }
}
