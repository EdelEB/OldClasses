import java.util.ArrayList;

public class ArrayListDemo
{
	public static void main(String[] args)
	{
	   ToDoList errands = new ToDoList();
	   errands.addToDoListItem("do homework");
	   errands.addToDoListItem("clean bedroom");
	   errands.addToDoListItem("take out trash");
	   errands.addToDoListItem("walk the dog");
	   errands.addToDoListItem("take a nap");
	   errands.displayToDoList();  
	}
}