
public class Lawyer extends Employee
{
    double courtRate;
    int courtHours;
    
    public Lawyer(String ln,String fn,String jt,double bp,int ch,double cr)
    {
        super(ln,fn,jt,bp);
        courtRate=cr;
        courtHours=ch;
    }

    public void yearlyPay()
    {
        basePay = (courtRate*courtHours) + basePay;
    }
}