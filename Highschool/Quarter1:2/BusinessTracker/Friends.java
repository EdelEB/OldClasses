import java.util.*;

public class Friends
{
    private ArrayList<Friend> myFriends;
    
    public Friends()
    {
        myFriends= new ArrayList<Friend>();
    }
    
    public ArrayList<Friend> getFriends()
    {
        return myFriends;
    }
    
    public void setFriends(ArrayList<Friend> friendList)
    {
        myFriends = friendList;
    }
    
    public void addFriend(String first, String last)
    {
        myFriends.add(new Friend(first,last));
    }
    
    public boolean findFriend(String first, String last)
    {
        for(int i=0;i<myFriends.size(); i++)
        {
            if(myFriends.get(i).getFirstName().equals(first)&&myFriends.get(i).getLastName().equals(last))
            {
                return true;
            }
        }
        return false;
    }
    
    public void displayFriends()
    {
        for(int i=0; i<myFriends.size(); i++)
        {
          System.out.println(myFriends.get(i));  
        }
    }
    
    public Friend findFriendWithLongestLastName()
    {
        int index = 0;
        
        for(int i=1; i<myFriends.size(); i++)
        {
            if(myFriends.get(i).getLastName().length()>myFriends.get(index).getLastName().length())
            {
                index = i;
            }
        }
        
        return myFriends.get(index);
    }
}
