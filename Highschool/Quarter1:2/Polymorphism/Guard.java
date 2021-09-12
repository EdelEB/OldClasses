
public class Guard extends Employee
{
    private double stipen;
    
    public Guard(String ln,String fn,String jt,double bp,double s)
    {
        super(ln,fn,jt,bp);
        stipen = s;
    }
    
    public void yearlyPay()
    {
        basePay+=stipen;
    }
}
