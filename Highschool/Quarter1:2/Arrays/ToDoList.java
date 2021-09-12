import java.util.*;

class ToDoList
{
   private ArrayList<String> myToDoList;        // THIS DECLARES THE ARRAYLIST ONLY BUT DOES NOT INSTANTIATE IT.
                                                // IT SHOULD BE INSTANTIATED IN THE CONSTRUCTOR BELOW.
   public ToDoList()
   {
      myToDoList = new ArrayList<String>();     // THIS IS IMPORTANT, YOU SHOULD INSTANTIATE THE ARRAYLIST IN THE CONSTRUCTOR
   }

   public void addToDoListItem(String toDoListItem)
   {
      myToDoList.add(toDoListItem);
   }

   public void displayToDoList()
   {
      for (int i = 0; i < myToDoList.size() - 1; i++)   // display all items except for last one
      {
         System.out.println(myToDoList.get(i) + ", ");
      }
      System.out.println(myToDoList.get(myToDoList.size() - 1)); // display last item without comma
   }
}