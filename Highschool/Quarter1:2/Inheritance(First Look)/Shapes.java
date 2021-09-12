public class Shapes
{
	public static void main(String[] args)
	{
    	System.out.println("\f");
    	Square shape1 = new Square(7,"Square");
    	System.out.println(shape1.getType()+shape1+"\nArea: "+shape1.area()+"\n");
    	
    	Rectangle shape2 = new Rectangle(6,10,"Rectangle");
    	System.out.println(shape2.getType()+shape2+"\nArea: "+shape2.area()+"\n");
    	
    	Parallelogram shape3 = new Parallelogram(5,8,6,"Parallelogram");
    	System.out.println(shape3.getType()+shape3+"\nArea: "+shape3.area()+"\n");
    	
    	Quadrilateral shape4 = new Quadrilateral(7,3,5,10,"Quadrilateral");
    	System.out.println(shape4.getType()+shape4+"\n");
	}
}
