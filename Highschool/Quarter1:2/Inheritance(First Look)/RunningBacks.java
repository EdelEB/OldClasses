public class RunningBacks extends Players
{
    private int RushingTDs;
    public RunningBacks(String theName, String coll, int RushTDs)
    {
        super (theName, coll);
        RushingTDs = RushTDs;
    }
    
    public String toString()
    {
        return "\nName: " + name + "\nCollege: " +
        college + "\nRushing Touchdowns: " + RushingTDs;
    }
    
    public void printCollege()
    {
        System.out.println("\n" + college);
    }
}