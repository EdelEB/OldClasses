import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
	    Grid x=new Grid(7,7,new String[]{"2","5","e","E","0","B","*"});
	    System.out.println(x);
	    
	    System.out.println(x.findMax());
	    //System.out.println(x.findMax());
	}
}