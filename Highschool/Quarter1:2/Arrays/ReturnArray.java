public class ReturnArray
{
    public static void main (String[] args)
    {
        String[] Names = {"Kevin", "Jenny", "Maddux"};
        Family myFamily = new Family(Names);
        System.out.print("\f");
        for (int x = 0; x < Names.length; x++)
            System.out.print(Names[x] + "\t");
        System.out.println("\n");

        Names = myFamily.add("Jacob");
        for (int x = 0; x < Names.length; x++)
            System.out.print(Names[x] + "\t");
        System.out.println("\n");
        
        Names = myFamily.add("Bradley");
        for (int x = 0; x < Names.length; x++)
            System.out.print(Names[x] + "\t");
        System.out.println("\n");
    }
}