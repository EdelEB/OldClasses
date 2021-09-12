
public class ShopManagerTester
{
    public static void main()
    {
        ShopManager [] stores = new ShopManager [2];
        
        //ShopManager a = new ShopManager();
        stores[0] = new Card();
        stores[1] = new Clothing();
        
        //a.calculateProfit();
        //b.calculateProfit();
        //c.calculateProfit();
        
        for(int i=0;i<2;i++)
        {
            stores[i].calculateProfit();
        }
    }
}
