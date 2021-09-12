
public class WinterOlympics
{
    String sport;
    String place;
    
    public WinterOlympics(String s, String p)
    {
        sport=s;
        place=p;
    }
    
    public void placeCompete()
    {
        System.out.println(sport+" will be competing at the "+place);
    }
}
