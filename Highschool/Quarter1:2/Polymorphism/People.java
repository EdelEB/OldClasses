public class People
{
    public static void main(String[] args)
    {
        Students[] studs = new Students[7];
        
        studs[0]= new HighSchool("Lincoln", 3.7, 25, 46);  //name, gpa, credit hours, rank
        studs[1]= new College("Kenya", 3.3, 44);  //name, gpa, credit hours
        studs[2]= new MiddleSchool("Sean", 3.9, 5);  //name, gpa, grade
        studs[3]= new MiddleSchool("Mateo", 2.5, 2);
        studs[4]= new HighSchool("Simmer", 4.0, 14, 3);
        studs[5]= new HighSchool("Jack", 1.8, 5, 452);
        studs[6]= new College("Danielle", 3.5, 67);
        
        for (int i = 0; i<studs.length; i++)
        {
            System.out.println(studs[i]);
            System.out.println("Graduating: " + studs[i].gradRequirements());
        }
    }
}