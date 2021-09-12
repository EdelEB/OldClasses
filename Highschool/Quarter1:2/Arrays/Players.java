import java.util.*;
public class Players
{
    public static void main (String[] args)
    {
        Stats boyce = new Stats ("Justin Boyce");
        Stats webb = new Stats ("Brandon Webb");
        
        boyce.out();
        webb.out();  
        boyce.hit();
        webb.out();
        boyce.out();
        webb.out();
        boyce.hit();
        webb.homerun();
        boyce.out();
        webb.out();
        boyce.homerun();
        webb.hit();
        boyce.homerun();
        
        System.out.print(boyce);
        System.out.print(webb);
    }
}