package myDefault;

public class Yorkshire extends Dog
{
	private int breedWeight = 75;
	
	public Yorkshire(String name)
	{
		super(name);
	}

	// -------------------------------------------------------------
	// Small bark -- overrides speak method in Dog
	// -------------------------------------------------------------
	public String speak()
	{
		return "woof";
	}
	
	public int avgBreedWeight() 
	{
		return breedWeight;
	}
}
