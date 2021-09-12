
public class Birthday extends Cards
{
    int age;
    
    public Birthday(String n,int a)
    {
        super(n);
        age=a;
        cost=2;
    }
    
    public Birthday(String n, double c, int a)
    {
        super(n,c);
        age=a;
    }
    
    public String greeting()
    {
        return "Dear "+super.getRecipient()+", Happy Birthday\nYou're "+age+" years old!\n"+super.costPhrase();
    }
}
