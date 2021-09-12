import java.awt.Color;

public class Apple implements Comparable
{
    private String variety;
    private Color color;
    private int weight;
    
    public Apple(String v, Color c, int w)
    {
        variety = v;
        color = c;
        weight = w;
    }
    
    public String getVariety()
    {
        return variety;
    }
    
    public Color getColor()
    {
        return color;
    }
    
    public int getWeight()
    {
        return weight;
    }
    
    public int compareTo(Object other)
    {
        if(this.weight<((Apple)other).weight)
            return -1;
        else if(this.weight==((Apple)other).weight)
            return 0;
        else
            return 1;
        //return Integer.this.weight.compareTo(((Apple)other).weight());
        
        int result=Integer.compare(this.weight,((Apple)other).weight);
        
        if(result==0)
            result= ((Integer)(color.getRGB()).compareTo(((Apple)other).color.getRGB()));
        
    }
}