public class BusinessTracker

{
    private String company;
    private int customers;
    private double money;

    public BusinessTracker(String comp, int cust, double dollars)
    {
        company=comp;
        customers=cust;
        money=dollars;
    }

    public String getCompany()
    {
        return company;
    }

    public String toString()
    {
        return "Company: "+company+" Customer: "+customers+" Money: "+money;
    }
}