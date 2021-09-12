import java.util.*;

public class Parrot
{
    private ArrayList<String> sounds = new ArrayList<String>();
    public int age = 0;
    private String name;
    
    public Parrot(String n)
    { 
        name=n;
    }

    public int getAge()
    { 
        return age;
    }

    public void train(String s)
    { 
        sounds.add(s);
    }

    public String speak()
    { 
        Random rand = new Random();
        int p = rand.nextInt(3);
        return sounds.get(p)+" SQUAK";
    }
}