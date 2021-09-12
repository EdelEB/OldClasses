public class Test6
{
    public static void main(String[] args)
    {
        String message = "I am very happy!";
        String target = "very ";
        String next = message.replace(target, "");
        
        System.out.print(next);
        
        String message2 = "I am very happy!";
        String target2 = "very ";
        int position = message2.indexOf(target2);
        
        String next2 = message2.substring(0,position)+message2.substring(position+target2.length());
        
    }
}