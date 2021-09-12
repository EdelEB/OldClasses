
public class Allosaur extends Dinosaur
{
    private String name;
    private boolean hunger;
    
    public Allosaur()
    {
        name="";
        hunger=false;
    }
    
    public Allosaur(String n)
    {
        name = n;
    }
    
    public Allosaur(String n, boolean h)
    {
        name = n;
        hunger = h;
    }
    
    public String roar()
    {
        if(getHungry())
            return "HUNGRY";
        return "RRRRR";
    }

    public String toString()
    {
        return name+": "+roar();
    }
}
