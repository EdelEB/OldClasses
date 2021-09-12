
public class Valentine extends Cards
{
    int kissNum;
    
    public Valentine(String n, int k)
    {
        super(n);
        kissNum=k;
        cost=2.50;
    }
    
    public Valentine(String n, double c, int k)
    {
        super(n,c);
        kissNum=k;
    }
    
    public String kisses()
    {
        String kisses="";
        int temp=kissNum;
        while(temp>0)
        {
            kisses+="xo";
            temp--;
        }
        
        return kisses;
    }
    
    public String greeting()
    {
        return "Dear "+super.getRecipient()+", Love and Kisses, "+kisses()+"\n"+super.costPhrase();
    }
}
