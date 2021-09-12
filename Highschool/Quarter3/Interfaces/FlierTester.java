
public class FlierTester
{
    public static void main()
    {
        Flier j = new SkiJumper("Sean White","mountain","skiing");
        Flier b = new Bird();
        Flier a = new Airplane();
        
        j.fly();
        b.fly();
        a.fly();
        ((SkiJumper)j).train(5);
        ((SkiJumper)j).train(8);
        ((SkiJumper)j).placeCompete();
    }
}
