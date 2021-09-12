

public class Engineer extends Employee
{
    private int travelRate,travelTime,hazardPay;
    
    public Engineer(String ln,String fn,String jt,double bp,int tr,int tt,int hp)
    {
        super(ln,fn,jt,bp);
        travelRate=tr;
        travelTime=tt;
        hazardPay=hp;
    }
    
    public void addTravelTime(int tt)
    {
        travelTime += tt;
    }
    
    public void setHazardPay(int hp)
    {
        hazardPay = hazardPay + hp;
    }
    
    public void yearlyPay()
    {
        basePay = basePay+(travelRate*travelTime)+hazardPay;
    }
}
