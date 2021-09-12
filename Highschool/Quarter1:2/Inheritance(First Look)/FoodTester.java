
public class FoodTester
{
    public static void main()
    {
        Food f = new Food("food",0);
        System.out.println(f);
        Tuna t = new Tuna("tuna",250);
        System.out.println(t);
        Potpie p = new Potpie("potpie",700);
        System.out.println(p);
        System.out.println(p.typeMeal());
        Tuna t3 = new Tuna("Tuna sandwich",500);
        System.out.println(t3);
        System.out.println("Calories: "+t3.getCalories());
        System.out.println();
        SideDish sd=new SideDish("Potato Chips",150,1.25);
        System.out.println(sd);
    }
}
