public class PassingArrays
{
    public static void main (String[] args)
    {
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        changeArray(nums);
        for (int x = 0; x < nums.length; x++)
            System.out.println(nums[x]);
    }
    
    public static void changeArray(int[] myArray)
    {
        myArray[0] = 5;
        myArray[1] = 6;
        myArray[2] = 7;
    }
}
