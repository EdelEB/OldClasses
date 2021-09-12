public class UmbrellaCorporation
{
    public static void main(String[] args)
    {
        Lawyer connolly = new Lawyer("Connolly", "Mike", "Lawyer", 175000, 34, 155);
        Lawyer arndt = new Lawyer("Arndt", "David", "Lawyer", 145000, 83, 155);
        Engineer arient = new Engineer("Arient", "John", "Engineer", 129000, 120, 35, 500);
        Engineer russo = new Engineer("Russo", "Aaron", "Engineer", 85000, 35, 35, 125);
        Engineer shepard = new Engineer("Shepard", "Sam", "Engineer", 110000, 75, 35, 500);
        Guard winkler = new Guard("Winkler", "Kai", "Guard", 35000, 350);
        Guard whalen = new Guard("Whalen", "Pat", "Guard", 37500, 350);
        connolly.yearlyPay();
        System.out.print(connolly);
        arndt.yearlyPay();
        System.out.print(arndt);
        arient.yearlyPay();
        System.out.print(arient);
        russo.yearlyPay();
        System.out.print(russo);
        shepard.yearlyPay();
        System.out.print(shepard);
        winkler.yearlyPay();
        System.out.print(winkler);
        whalen.yearlyPay();
        System.out.print(whalen);
    }
}