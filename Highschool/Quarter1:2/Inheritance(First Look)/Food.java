
public class Food
{
    String food;
    int calories;
    
    public Food()
    {
        food = "None";
    }
    
    public Food(String f, int c)
    {
        food = f;
        calories = c;
    }
    
    public String typeMeal()
    {
        return "Anytime";
    }
    
    public String toString()
    {
        return "This "+food+" is good" ;
    }
}
