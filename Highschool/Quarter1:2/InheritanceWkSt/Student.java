public class Student extends Person{
    private int id;
    private double gpa;
    public Student(String n, double w, int i, double GPA)
    {
        super(n,w);
        id = i;
        gpa = GPA;
    }
    
    public double getGpa()
    {
        return gpa;
    }    
    
    public void attendClass()
    {
        if(asleep)
        {
            if(gpa > 0)
                gpa = gpa - 0.1;

        }
        else
            if(gpa < 4.0)
                gpa = gpa + 0.1;
    }

    public void sleep()
    {
        System.out.println("Student sleep");
    }
}