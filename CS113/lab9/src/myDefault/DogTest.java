package myDefault;

public class DogTest 
{
	public static void main(String[] args) 
	{
		Dog york = new Yorkshire("Spike");
		System.out.println(york.getName() + " says " + york.speak()  + " " + york.avgBreedWeight());
		Dog rador = new Labrador("TestName", "White");
		System.out.println(rador.getName() + " says " + rador.speak() + " " + rador.avgBreedWeight());
	}
}
