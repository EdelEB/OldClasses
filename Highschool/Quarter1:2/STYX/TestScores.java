import java.util.*;
public class TestScores
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<Integer>();
        int input = 0;
        int count = 0;
        while(input!=-1)
        {
            count++;
            System.out.print("What did the student get on test #"+count+"(-1 to quit): ");
            input = in.nextInt();
            if(input==-1)
                break;
            double average = 0;
            scores.add(input);
            for(int i=0;i<scores.size();i++)
            {
                System.out.println("Test #"+(i+1)+": "+scores.get(i)+"%");
                average += scores.get(i);
            }
            average = average/scores.size();
            System.out.println("Average: "+average+"%");
            
            if(average>=63&&average<70)
                System.out.println("Grade: D");
            else if(average>=70&&average<80)
                System.out.println("Grade: C");
            else if(average>=80&&average<90)
                System.out.println("Grade: B");
            else if(average>=90)
                System.out.println("Grade: A");
            else
                System.out.println("Grade: F");
        }
        System.out.println("Goodbye");
    }
}
