// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.*;

public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of salesmen: ");
        int number = scan.nextInt();

        final int SALESPEOPLE = number;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        double average;
        int max = 0;
        int min = 0;        

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
            if (sales[max]<sales[i])
            {
                max = i;
            }

            if (sales[min]>sales[i])
            {
                min = i;
            }
        }

        System.out.println("\nSalesperson   Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println("     " + (i+1) + "         " + sales[i]);
            sum += sales[i];
        }

        System.out.println("\nTotal sales: " + sum);

        average = (double)sum/(sales.length);

        System.out.println("Average Sales: " + average);

        System.out.println("Max sales: "+sales[max]+" -Salesperson "+(max+1)); 
        System.out.println("Minimum sales: "+sales[min]+" -Salesperson "+(min+1));

        System.out.print("Enter a value: ");
        int value = scan.nextInt();

        int counter=0;
        for(int i=0; i<sales.length; i++)
        {
            if(sales[i]>value)
            {
                System.out.println("Salesperson "+(i+1)+" exceeded sales");
                counter++;
            }
            else{}
        }

        System.out.println(counter+" Salespeople exceeded sales");
    }
}