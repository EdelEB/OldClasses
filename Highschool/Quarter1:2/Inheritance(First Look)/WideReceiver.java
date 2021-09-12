
public class WideReceiver extends Players
{
    private int receptions,rushingYards,receivingTD;
    public WideReceiver(String n, String c, int r, int ry, int rtd)
    {
        super(n,c);
        receptions=r;
        rushingYards=ry;
        receivingTD=rtd;
    }
    
    public String toString()
    {
        return super.toString()+"\nTDs "+receivingTD+"\nRY "+ rushingYards+"\nR "+receptions;
    }
    
    public void printCollege()
    {
        System.out.println("\n" + college);
    }
}
