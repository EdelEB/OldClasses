package myDefault;

public class SortedIntList extends IntList
{
	protected int[] list;
	protected int numElements = 0;

	public SortedIntList(int size) 
	
	{
		super(size);
		this.list = new int[10];
		// TODO Auto-generated constructor stub
	}
	@Override
	public void add(int value) 
	{
		// TODO Auto-generated method stub
		if (numElements == list.length)
			System.out.println("Can't add, list is full");
		else {
			list[numElements] = value;

			for (int i = numElements; i >0; i--) 
			{
				if(list[i] > list[i-1])
				{
					break;
				}else{
					int temp = list[i];
					list[i] = list[i-1];
					list[i-1] = temp;
				}
				
			}
			this.numElements ++;
			}

	}
	public String toString() 
	{
		String returnString = "";
		for (int i = 0; i < numElements; i++)
			returnString += i + ": " + this.list[i] + "\n";
		return returnString;
	}

}
