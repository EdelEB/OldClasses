
public class Quadrilateral
{
    double side1,side2,side3,side4;
	String type;

	public Quadrilateral(double s1, double s2, double s3, double s4, String t)
	{
    	side1 = s1;
    	side2 = s2;
    	side3 = s3;
    	side4 = s4;
	    type=t;
	}
	
	public String getType()
	{
    	return type;
	}
	
	public double area()
	{
	    return side1*side2;
	}
	
	public String toString()
	{
	    return "\nThe four sides are: "+side1+" "+side2+" "+side3+" "+side4;
	}
}
