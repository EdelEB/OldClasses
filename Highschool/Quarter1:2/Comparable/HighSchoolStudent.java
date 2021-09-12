class HighSchoolStudent implements Comparable
{
    private double gpa;
    private String name;
    private int height;

    //Constructor with gpa, name and height
    public HighSchoolStudent(double g, String n, int h)
    {
        gpa=g;
        name=n;
        height=h;
    }

    //compareTo method  - gpa
    public int compareTo(Object other)
    {
        if(gpa>((HighSchoolStudent)other).getGPA())
            return 1;
        else if(gpa<((HighSchoolStudent)other).getGPA())
            return -1;
        return 0;
    }

    //toString method - name, ga and height
    public String toString()
    {
        String string=(name+"\nGPA: "+gpa+"\nHeight: "+height);
        return string;
    }

    public double getGPA()
    {
        return gpa;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getHeight()
    {
        return height;
    }
}