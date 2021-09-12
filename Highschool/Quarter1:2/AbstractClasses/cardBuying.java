import java.util.*;

public class cardBuying
{
    public static void main()
    {
        ArrayList<Cards> cards = new ArrayList<Cards>();
        
        cards.add(new Holiday("Kinzler"));
        cards.add(new Holiday("Dylan",3.50));
        cards.add(new Birthday("Edel",18));
        cards.add(new Birthday("Gabby",4.12,18));
        cards.add(new Valentine("Josh",5));
        cards.add(new Valentine("Mike",6.25,0));
        
        for(Cards card: cards)
        {
            System.out.println(card.greeting());
        }
    }
}
