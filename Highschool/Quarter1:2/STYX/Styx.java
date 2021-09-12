import java.util.*;
public class Styx
{
    public static void main()
    {
        ArrayList<String> band = new ArrayList<String>();
        ArrayList<String> Xband = new ArrayList<String>();
        
        //1970
        band.add("Dennis DeYoung");
        band.add("Chuck Panazzo");
        band.add("John Panozzo");
        band.add("James Young");
        band.add("John Curulewski");
        
        System.out.println("1970");
        for(int i=0; i<band.size();i++)
        {
            System.out.println(band.get(i));
        }
        System.out.println();
        
        //1980
        band.add("Tommy Shaw");
        band.remove("John Curulewski");
        Xband.add("John Curulewski");
        
        System.out.println("1980");
        for(int i=0; i<band.size();i++)
        {
            System.out.println(band.get(i));
        }
        System.out.println();
        
        //1990
        System.out.println("1990");
        for(int i=0; i<band.size();i++)
        {
            System.out.println(band.get(i));
        }
        System.out.println();
        
        //2000
        band.add("Glen Burtnik");
        band.add("Todd Sucherman");
        band.add("Lawrence Gowan");
        band.remove("John Panozzo");
        Xband.add("John Panozzo");
        band.remove("Dennis DeYoung");
        Xband.add("Dennis DeYoung");
        
        System.out.println("2000");
        for(int i=0; i<band.size();i++)
        {
            System.out.println(band.get(i));
        }
        System.out.println();
        
        //2010
        band.remove("Glen Burtnik");
        Xband.add("Glen Burtnik");
        band.add("Ricky Phillips");
        
        System.out.println("2010");
        for(int i=0; i<band.size();i++)
        {
            System.out.println(band.get(i));
        }
        System.out.println();
        
        //2017
        System.out.println("2017");
        for(int i=0; i<band.size();i++)
        {
            System.out.println(band.get(i));
        }
        System.out.println();
        
        System.out.println("ExBand");
        for(int i=0; i<Xband.size();i++)
        {
            System.out.println(Xband.get(i));
        }
        System.out.println();
    }
}
