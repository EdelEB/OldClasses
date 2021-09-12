public class BankAccountTester
{
    public static void main()
    {
        BankAccount bank = new BankAccount();
        SavingsAccount saving = new SavingsAccount(300);
        CheckingAccount checking = new CheckingAccount();
        
        bank.deposit(500);
        bank.withdraw(200);
        bank.withdraw(30);
        bank.deposit(100);
        bank.monthEnd();
        System.out.println(bank.getBalance());  //Expected 370.0
        
        saving.deposit(800);
        saving.setInterestRate(0.75);
        saving.withdraw(100);
        saving.withdraw(50);
        saving.deposit(200);
        saving.monthEnd();
        System.out.println(saving.getBalance());  //Expected 1152.25
        
        checking.deposit(200);
        checking.withdraw(10);
        checking.withdraw(40);
        checking.withdraw(20);
        checking.deposit(30);
        checking.withdraw(25);
        checking.monthEnd();
        System.out.println(checking.getBalance());  //Expected 134
        
        
        
    }
}