public class UmbrellaCorporation
{
    public static void main(String[] args)
    {
        Employee connolly = new Lawyer("Connolly", "Mike", "Lawyer", 175000, 34, 155);
        Employee arndt = new Lawyer("Arndt", "David", "Lawyer", 145000, 83, 155);
        Employee arient = new Engineer("Arient", "John", "Engineer", 129000, 120, 35, 500);
        Employee russo = new Engineer("Russo", "Aaron", "Engineer", 85000, 35, 35, 125);
        Employee shepard = new Engineer("Shepard", "Sam", "Engineer", 110000, 75, 35, 500);
        Employee winkler = new Guard("Winkler", "Kai", "Guard", 35000, 350);
        Employee whalen = new Guard("Whalen", "Pat", "Guard", 37500, 350);
        ((Lawyer)connolly).yearlyPay();
        System.out.print(connolly);
        ((Lawyer)arndt).yearlyPay();
        System.out.print(arndt);
        ((Engineer)arient).yearlyPay();
        System.out.print(arient);
        ((Engineer)russo).yearlyPay();
        System.out.print(russo);
        ((Engineer)shepard).yearlyPay();
        System.out.print(shepard);
        ((Guard)winkler).yearlyPay();
        System.out.print(winkler);
        ((Guard)whalen).yearlyPay();
        System.out.print(whalen);
    }
}