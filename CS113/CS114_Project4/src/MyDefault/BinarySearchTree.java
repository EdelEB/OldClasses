package MyDefault;

import java.util.Iterator;

/*
*
*  BinarySearchTree.java
*
*/

public class BinarySearchTree<E extends Comparable<? super E>> extends BinaryTree<E> {

	public void insert(E data) {
		
	}
	
	public void remove(E data) {
		if(search(data)){
			remove(data, root);
		}
	}
	
	public void remove(E data, Node<E> curr) {
		if(curr.data.compareTo(data)==0) { 
			if(curr.right!=null){
				swap(curr,curr.right); 
				remove(data,curr.right);
			}
			else {
				curr = null;
			}
		} 
		else if(curr.right!=null && data.compareTo(curr.right.data))
		else if(curr.data.compareTo(data)<0) {
			
		}
	}
	
	public boolean search(E data) {
		return search(data,root);
	}
	
	public boolean search(E data, Node<E> curr) {
		if(curr == null) {
			return false;
		}
		if(curr.data.compareTo(data)==0) {
			return true;
		}
		if(curr.data.compareTo(data)<0) {
			return search(data,curr.left);
		}
		return search(data,curr.right);
	}
	
	public void swap(Node<E> A, Node<E> B) {
		E temp = A.data;
		A.data=B.data;
		B.data=temp;
	}
	
	public Node<E> root = null;

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	interface Stack<E> extends Iterable<E> {
	    boolean empty();
	    E peek();
	    E pop();
	    void push(E data);
	}

	class AStack<E> implements Stack<E> {

	    private class StackIterator<E> implements Iterator<E> {
	        public boolean hasNext() {
	            return curr > 0;
	        }
	        public E next() {
	            return (E)stack[--curr];
	        }
	        public void remove() {
	            throw new UnsupportedOperationException();
	        }
	        private int curr = top;
	    }

	    public boolean empty() {

	        return top == 0;
	    }

	    private void grow() {

	        Object[] temp = new Object[stack.length * 2];

	        for (int i = 0; i < stack.length; ++i) {
	            temp[i] = stack[i];
	        }

	        stack = temp;
	    }

	    public Iterator<E> iterator() {

	        return new StackIterator<E>();
	    }

	    public E peek() {

	        E temp = pop();
	        push(temp);
	        return temp;
	    }

	    public E pop() {

	        E temp = null;

	        if (top <= stack.length / 3 && stack.length > 10) {
	            shrink();
	        }

	        if (top > 0) {
	            temp = (E)stack[--top];
	        }

	        return temp;
	    }

	    public void push(E data) {

	        if (top >= stack.length) {
	            grow();
	        }

	        stack[top++] = data;
	    }

	    private void shrink() {

	        Object[] temp = new Object[stack.length / 2];

	        for (int i = 0; i < temp.length; ++i) {
	            temp[i] = stack[i];
	        }

	        stack = temp;
	    }

	    private Object[] stack = new Object[10];
	    private int top;
	}


}


