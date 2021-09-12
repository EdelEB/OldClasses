
public class BankAccount
{
    public double balance;
    
    public BankAccount()
    {
        balance = 0.0;
    }
    
    public void withdraw(double amount)
    {
        balance-=amount;
    }
    
    public void deposit(double amount)
    {
        balance+=amount;
    }
    
    public void monthEnd(){}
    
    public double getBalance()
    {
        return balance;
    }
}
