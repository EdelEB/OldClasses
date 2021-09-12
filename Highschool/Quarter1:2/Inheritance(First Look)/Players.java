public class Players
{
    public String name, college;
    
    public Players(String n, String c)
    {
        name = n;
        college = c;
    }

    public String toString()
    {
        return "\nName: "+name+"\nCollege: "+college;
    }
    
    public void printName()
    {
        System.out.println("\n" + name);
    }
}