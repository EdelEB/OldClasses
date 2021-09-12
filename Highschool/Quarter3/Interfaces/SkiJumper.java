
public class SkiJumper extends WinterOlympics implements Flier, Athlete
{
    double myHoursTraining;
    public String name;
    
    public SkiJumper(String n, String p, String s)
    {
        super(s,p);
        name=n;
    }
    
    public void fly()
    {
        System.out.println(name+" Using skis to fly");
        System.out.println("Will not exceed "+MAX_ALTITTUDE+" feet");
    }
    
    public void train(double h)
    {
        myHoursTraining+=h;
        System.out.println(name+" trained "+myHoursTraining+" hours.");
    }
}
