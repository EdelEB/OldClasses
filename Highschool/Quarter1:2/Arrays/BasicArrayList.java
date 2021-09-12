import java.util.*;
public class BasicArrayList
{
    public static void main (String[] args)
    {
        ArrayList<String> team = new ArrayList<String>();
        team.add("D. Rose");
        team.add("C. Boozer");
        for (String x: team)
            System.out.println(x);
        System.out.println();
        
        team.add(1, "R. Brewer");
        team.add("J. Noah");
        for (int x = 0; x < team.size(); x++)
            System.out.println(team.get(x));
        System.out.println();
        
        String cut = team.set(1, "R. Hamilton");
        for (int x = 0; x < team.size(); x++)
            System.out.println(team.get(x));
        System.out.println("Cut = " + cut);
        System.out.println();
        
        team.add(2, "L. Deng");
        cut = team.remove(3);
        for (int x = 0; x < team.size(); x++)
            System.out.println(team.get(x));
        System.out.println("Cut = " + cut);
        System.out.println();
        
        int loc = team.indexOf("L. Deng");
        team.remove(loc);
        for (int x = 0; x < team.size(); x++)
            System.out.println(team.get(x));
    }
}