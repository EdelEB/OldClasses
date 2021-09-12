public class Test1
{
    public static void main(String[] args)
    {
        String firstName = "Sofia";
        String middleName = "Maria";
        String lastName = "Hernandez";
        String initials = firstName.substring(0,1) + middleName.substring(0,1) + lastName.substring(0,1);
        System.out.println(initials.toLowerCase());
    }
}