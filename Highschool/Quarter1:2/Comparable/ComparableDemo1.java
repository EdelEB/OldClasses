public class ComparableDemo1
{
   public static void main(String[] args)
   {
      HighSchoolStudent student1 = new HighSchoolStudent(3.0, "Angie", 56);
      HighSchoolStudent student2 = new HighSchoolStudent(2.9, "Bill", 72);
      
      if (student1.compareTo(student2) > 0)
      {
         System.out.println(student1 + "\nIS GREATER THAN\n" + student2);
      }
      else if (student1.compareTo(student2) < 0)
      {
         System.out.println(student1 + "\nIS LESS THAN\n" + student2);
      }
      else
      {
         System.out.println(student1 + "\nIS EQUAL TO\n" + student2);
      }
      
      System.out.println();
      
      ElementarySchoolStudent student3 = new ElementarySchoolStudent(100, "Colleen");
      ElementarySchoolStudent student4 = new ElementarySchoolStudent(12, "David");
      
      if (student3.compareTo(student4) > 0)
      {
         System.out.println(student3 + "\nIS GREATER THAN\n" + student4);
      }
      else if (student3.compareTo(student4) < 0)
      {
         System.out.println(student3 + "\nIS LESS THAN\n" + student4);
      }
      else
      {
         System.out.println(student3 + "\nIS EQUAL TO\n" + student4);
      }
   }// end of main method
}