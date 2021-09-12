public abstract class Students
{
    private String name;
    public double GPA;
    
    public Students(String name, double GPA)
    {
        this.name = name;
        this.GPA = GPA;
    }
    
    public String toString()
    {
        return "\n\nName: "+name +"\nGPA: "+GPA;
    }
    
    public abstract boolean gradRequirements();
}

        