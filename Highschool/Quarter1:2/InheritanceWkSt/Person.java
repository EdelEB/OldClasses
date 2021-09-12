public class Person
{
    private String name;
    private double weight;
    public boolean asleep;
    public Person(String n, double w)
    {
        name = n;
        weight = w;
        asleep = false;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void sleep()
    {
        System.out.println("Person sleep");
        asleep = true;
    }

    public void wake()
    {
        System.out.println("Person wake");
        asleep = false;
    }
}