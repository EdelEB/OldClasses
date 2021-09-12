
public class LinearSearch
{
    public static int linearSearch(int [] ray,int key)
    {
        for(int i=0;i<ray.length;i++)
            if(ray[i]==key)
                return i;
        return -1;
    }
}
