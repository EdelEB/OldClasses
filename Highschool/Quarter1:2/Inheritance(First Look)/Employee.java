import java.util.*;

public class Employee
{
    public String lastName,firstName,jobTitle;
    public int id;
    public double basePay,totalPay;
    
    public Employee(String ln,String fn,String jt,double bp)
    {
        lastName=ln;
        firstName=fn;
        jobTitle=jt;
        basePay=bp;
    }
    
    public String toString()
    {
        int ID = (int)(Math.random()*8999+1000);
        return lastName+", "+firstName+"\nID: "+ID+"\nJob Title: "+jobTitle+"\nTotal Pay: "+basePay+"\n";
    }
}
