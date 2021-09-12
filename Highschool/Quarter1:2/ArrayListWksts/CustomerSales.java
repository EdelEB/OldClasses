import java.util.*;
public class CustomerSales
{
    public static void main (String[] args)
    {
        ArrayList<BusinessTracker> business = new ArrayList<BusinessTracker>();
        business.add (new BusinessTracker("Buffalo Wild Wings", 140, 2145.25));
        business.add (new BusinessTracker("Red Robin", 68, 1749.50));
        business.add (new BusinessTracker("Panera", 193, 1411));
        business.add (new BusinessTracker("McDonalds", 450, 1984.88));
        
        //print out all of the businesses on one line using the toString method
        System.out.println("\f" + business);
        
        //prints out the business stored at 0 (Buffalo Wild Wings), this invokes the toString method
        System.out.println(business.get(0));

        //prints out the business name stored at 1 (Red Robin)
        System.out.println(business.get(1).getCompany());

        //removes the business stored at 1 (Red Robin) and prints it out
        //Panera and McDonalds storage location is decreased by one and the size goes down by one.
        System.out.println(business.remove(1));

        //adds a new business at the 2nd storage location
        //moves the rest of the businesses up one for their storage location (McDonalds)
        business.add (2, new BusinessTracker("Wendys", 323, 1594.54));

        //removes the business storage at location 1 (Panera), prints it out and replaces it with Burger King
        System.out.println(business.set(1, new BusinessTracker("Burger King", 132, 784.21)));

        //prints out the size of the ArrayList
        System.out.println("Size: " + business.size());
        
        //prints out all of the businesses on separate lines
        for (int x = 0; x < business.size(); x++)
            System.out.println(business.get(x));

        //for each
        for (BusinessTracker bus: business)
            System.out.println(bus.getCompany());
    }
}