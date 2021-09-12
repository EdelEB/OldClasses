public class StudentTester
{
    public static void main()
    {
        Student [] s = new Student[3];
        s[0] = new Student("S");
        s[1] = new Graduate("G");
        s[2] = new UnderGraduate("U");
        
        for(Student x: s)
         System.out.println(x.getName());
     
    }
}