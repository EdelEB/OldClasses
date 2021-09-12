public class Football
{
    public static void main (String[] args)
    {
        Quarterbacks Cutler = new Quarterbacks("Jay Cutler", "Vanderbilt", 136, 100);
        System.out.println(Cutler);

        RunningBacks Forte = new RunningBacks("Matt Forte", "Tulane", 26);
        System.out.println(Forte);

        WideReceiver Marshall = new WideReceiver("Brandon Marshall", "Central Florida", 118, 1508, 11);
        System.out.println(Marshall);

        OffensiveLineman Garza = new OffensiveLineman("Roberto Garza", "Texas A&M - Kingsville");
        System.out.println(Garza);
        
        TightEnd Davis = new TightEnd("Kellen Davis", "Michigan State", 19, 229, 2);
        System.out.println(Davis);
    }
}
