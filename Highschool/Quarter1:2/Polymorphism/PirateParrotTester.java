/**
 * Edel Barcenas
 * 2/1/18
 */
public class PirateParrotTester
{
    public static void main()
    {
        PirateParrot polly = new PirateParrot("Polly");

        System.out.println(polly.getAge()); // prints 0
        polly.stealSoul(5); /* code to increase Polly's age by 5 years */
        System.out.println(polly.getAge()); // prints 5

        polly.stealSoul(5);
        polly.stealSoul(10);
        System.out.println(polly.getAge()); // prints 20

        polly.train("Walk the plank.");
        polly.train("Off with his head.");

        // Polly retires from his life as a pirate to a cushy life as a pet
        Parrot myPetPolly = polly;
        System.out.println(myPetPolly.getAge()); // prints 20
        myPetPolly.train("Time for bed.");
        System.out.println(myPetPolly.speak());
    }
}