package myDefault;



import java.util.Iterator;

public class SortedList<E extends Comparable<? super E>> extends List<E> 
{
	
    public void insert(E data) //inserts object into its correct sorted position
    {
        Node<E> temp = head;
        Node<E> insert = new Node<E>(data);
        
        insert(temp,insert);
        
    }
    
    private void insert(Node<E> curr, Node<E> insert)
    {
    	if(head==null)
    	{
    		head=insert;
    		return;
    	}
    	else if(insert.data.compareTo(head.data)<0)
    	{
    		insert.next = head;
    		head = insert;
    		return;
    	}
    	else if(insert.data.compareTo(curr.data) > 0 && 
    			(curr.next == null || insert.data.compareTo(curr.next.data) <= 0))
        {
            insert.next = curr.next;
            curr.next = insert;
            return;
        }
        else
        {
        	insert(curr.next,insert);
        }    	
    }
	
	public Iterator<E> iterator() 
	{
        return new Iterator<E>() 
        {
            public boolean hasNext() 
            {
                return curr != null;
            }
            public E next() 
            {
                E temp = curr.data;
                curr = curr.next;
                return temp;
            }
            private Node<E> curr = head;
        };
	}
       
	public void remove(E data)
	{	
		Node<E> temp = new Node<E>(data);
		
		remove(head, temp);		
	}

	private void remove(Node<E> curr, Node<E> remove)
	{
		if(search(remove.data))
		{
			if(head.data.compareTo(remove.data)==0)
			{
				head = head.next;
			}
			else if(remove.data.compareTo(curr.next.data)==0)
			{
				curr.next = curr.next.next;
			}
			else
			{
				remove(curr.next, remove);
			}
		}
	}
	
	
	
	public E retrieve(int index)
	{
		return retrieve(head, index, 0);
	}
	
	private E retrieve(Node<E> curr, int index, int count)
	{
		if (count == index && curr != null)
		{
			return curr.data;
		}
		if(curr.next != null)
		{
			return retrieve(curr.next, index, ++count);
		}
		return null;
	}
	
	public boolean search(E data)
	{
		return search(data, head);
	}
	
	public boolean search(E data, Node<E> curr)
	{
		if(curr==null)
		{
			return false;
		}
		if(curr.data.compareTo(data) == 0 ||
				curr.next == null)
		{
			return curr.data.compareTo(data)==0;
		}
		if(curr.next.data.compareTo(data)==0)
		{
			return true;
		}
		return search(data, curr.next);
	}
} 
















