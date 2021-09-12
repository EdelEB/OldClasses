import java.util.*;

public class AnimalTester
{
    public static void main()
    {
        ArrayList<Animal> alist = new ArrayList<Animal>();

        
        alist.add(new Dog());
        alist.add(new Dog());
        alist.add(new Dog());
        alist.add(new Dog());
        
        alist.add(new Cat());
        alist.add(new Cat());
        alist.add(new Cat());
        
        alist.add(new Pengu());
        alist.add(new Pengu());        
        
        alist.add(new Dog());
        alist.add(new Rhino());
       
        for (int i=0;i<alist.size();i++)
        {
            System.out.println(alist.get(i).noise());
        }
        
        for(Animal x: alist)
        {
            System.out.println(x.getName());
        }
        
        System.out.println(((Dog)alist.get(2)).getAge());
    }
}
