
public class Friend
{
    private String myFirstName;
    private String myLastName;
    
    public Friend(String first, String last)
    {
        myFirstName=first;
        myLastName=last;
    }
    
    public String getFirstName()
    {
        return myFirstName;
    }
    
    public String getLastName()
    {
        return myLastName;
    }
    
    public String toString()
    {
        return myFirstName+" "+myLastName;
    }
}
