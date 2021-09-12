import java.util.*;

public class BusinessTracker

{
    private String company;
    private int customers;
    private double money;

    public BusinessTracker(String comp, int cust, double dollars)
    {
        company = comp;
        customers = cust;
        money = dollars;
    }

    public String getCompany()
    {
        return company;
    }
    
    public int getCustomers()
    {
        return customers;
    }
    
    public double getMoney()
    {
        return money;
    }

    public String toString()
    {
        String string = getCompany()+" "+getCustomers()+" "+getMoney()+" ";
        return string;
    }
}