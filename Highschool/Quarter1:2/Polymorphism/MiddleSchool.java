public class MiddleSchool extends Students
{
    private int hoursNeeded = 23;
    private int grade;
    public MiddleSchool (String n, double gpa, int grade)
    {
        super(n, gpa);
        this.grade = grade;
    }
    
    public boolean gradRequirements()
    {
        return true;
    }
    
    public String toString()
    {
        return super.toString() + "\nGrade: " + grade;
    }
}
