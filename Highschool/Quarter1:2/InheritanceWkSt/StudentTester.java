public class StudentTester
{
    public static void main()
    {
        Student s = new Student("Tryndamere", 220.2, 1337,3.5);
        s.attendClass();
        s.sleep();
        s.attendClass();
        s.attendClass();
        System.out.println(s.getName() + "’s gpa = "+ s.getGpa());
    }
}