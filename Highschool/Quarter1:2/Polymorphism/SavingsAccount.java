
public class SavingsAccount extends BankAccount
{
    private double minBalance;
    private double interestRate;
    
    public SavingsAccount(double b)
    {
        minBalance = b;
        balance = b;
        interestRate = 0.0;
    }
    
    public void setInterestRate(double a)
    {
        interestRate=a*.01;
    }
    
    public void withdraw(double amount)
    {
        super.withdraw(amount);
        if(balance<minBalance)
        {
            minBalance=balance;
        }
    }

    public void monthsEnd()
    {
        balance += interestRate*minBalance;
    }
}
