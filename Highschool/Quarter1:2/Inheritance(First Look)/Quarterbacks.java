public class Quarterbacks extends Players
{
    private int PassingTDs, Interceptions;
    public Quarterbacks(String theName, String coll, int PassTDs, int Picks)
    {
        super (theName, coll);
        PassingTDs = PassTDs;
        Interceptions = Picks;
    }
    
    public String toString()
    {
        return "\nName: " + name + "\nCollege: " + college +
        "\nPassing Touchdowns: " + PassingTDs +
        "\nInterceptions: " + Interceptions;
    }
}