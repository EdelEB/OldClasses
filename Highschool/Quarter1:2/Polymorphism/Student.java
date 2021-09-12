public class Student
{
    public final static int NUM_TESTS = 3;
    private String myName;
    private int [] myTests;
    private String myGrade;
   
    public Student()
    {
        myName="";
    }
    
    public Student(String n)
    {
        myName=n;
    }
    
    public Student(String n, int [] t, String g)
    {
        myName=n;
        myTests=t;
        myGrade=g;
    }
    
    public String getName()
    {
        return myName;
    }
    
    public String getGrade()
    {
        return myGrade;
    }
    
    public void computeGrade()
    {
        if(myName.equals(""))
        myGrade = "No grade";
        else if (getTestAverage()>=65)
        myGrade = "Pass";
        else
        myGrade = "Fail";
    }
    
    public double getTestAverage()
    {
        double total = 0;
        for(int score: myTests)
        total+=score;
        return total/NUM_TESTS;
    }
}