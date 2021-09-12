public class College extends Students
{
    private int hoursNeeded = 60;
    private double creditHours;
    public College (String n, double gpa, double hours)
    {
        super(n, gpa);
        creditHours=hours;
    }
    
    public boolean gradRequirements()
    {
        return creditHours >= hoursNeeded;
    }
    
    public String toString()
    {
        return super.toString()+"\nCredit Hours: "+creditHours;
    }
}
