public class HighSchool extends Students
{
    private int hoursNeeded = 23;
    private int rank;
    private double creditHours;
    public HighSchool (String n, double gpa, double hours, int rank)
    {
        super(n, gpa);
        this.rank = rank;
        creditHours=hours;
    }
    
    public boolean gradRequirements()
    {
        return creditHours >= hoursNeeded;
    }
    
    public String toString()
    {
        return super.toString()+"\nRank: "+rank+"\nCredit Hours: "+creditHours;
    }
    
    public int getRank()
    {
        return rank;
    }
}
