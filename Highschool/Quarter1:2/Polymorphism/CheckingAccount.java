
public class CheckingAccount extends BankAccount
{
    private int withdrawals;
    
    public CheckingAccount()
    {
        withdrawals=0;
    }
    
    public void withdraw(double amount)
    {
        super.withdraw(amount);
        withdrawals++;
        if(withdrawals>3)
            balance--;
    }
    
    public void monthEnd()
    {
        withdrawals=0;
    }
}
