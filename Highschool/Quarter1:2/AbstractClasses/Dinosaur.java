
public abstract class Dinosaur
{
    private String dName;
    private boolean hungry;
    
    public Dinosaur()
    {
        dName="";
        hungry=false;
    }
    
    public Dinosaur(String name)
    {
        dName=name;
        hungry=false;
    }
    
    public Dinosaur(String name, boolean hunger)
    {
        dName=name;
        hungry=hunger;
    }
    
    public abstract String roar();
    
    public boolean getHungry()
    {
        return hungry;
    }
    
    public String toString()
    {
        return dName;
    }
}
