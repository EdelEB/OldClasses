package MyDefault;

import java.util.Iterator;
import java.lang.Math;
public class BinarySearchTree2<E extends Comparable<? super E>> extends BinaryTree<E> {

	
	public Iterator<E> iterator() {
		Stack<Node<E>> stack = new RStack<>();
		while(root!=null) {
			stack.push(root);
			root=root.left;
		}
		return null;
	}
	
	public void reBalance() { 
		reBalance(root);
	}
	
	public void reBalance(Node<E> root) {
		int balance = balance();
		if(balance==0)
			return;
		if(balance==-1) 
			rotateRight(root);
		if(balance==1)
			rotateLeft(root);
	}
	
	public int balance() {//0=centered -1=leftHeavy 1=rightHeavy
		return balance(root);
	}
	
	public int balance(Node<E> curr) {//0=centered -1=leftHeavy 1=rightHeavy
		int left = childCount(curr.left, 0);
		int right = childCount(curr.right,0);
		if(Math.abs(left-right)>1)
			return 0;
		if(left-right>0)
			return -1;
		return 1;
	}
	
	public int childCount(Node<E> curr, int count) {
		int right, left;
		if(curr.right == null  && curr.left== null)
			return count;
		else {
			right = childCount(curr.right, count+1);
			left = childCount(curr.left,count+1);
		}
		if(right>=left)
			return right;
		if(left>=right)
			return left;
		return 0;
	}

	public void insert(E data) {
		root = insert(data,root);
	}

	public Node<E> insert(E data, Node<E> root) {
		if(root==null) {
			root=new Node(data);
			return root;
		}
		
		if(data.compareTo(root.data)<1)
			root.left=insert(data,root.left);
		else if(data.compareTo(root.data)>1)
			root.right=insert(data,root.right);
		return root;
		
	}
	
	public E minValue(Node<E> root) {
		E minv=root.data;
		while(root.left!=null) {
			minv = root.left.data;
			root = root.left;
		}
		return minv;
	}
	
	public void remove(E data) {
		if(search(data))	
			root=remove(data,root);
	}
	
	public Node<E> remove(E data, Node<E> root){
		if(root==null)
			return root;
		if(data.compareTo(root.data)<0)
			root.left = remove(data,root.left);
		else if(data.compareTo(root.data)>0)
			root.right = remove(data,root.right);
		else {
			if(root.left==null)
				return root.right;
			else if (root.right==null)
				return root.left;
			
			root.data=minValue(root.right);
			root.right=remove(root.data,root.right);		
		}
		return root;
	}

	public void rotateLeft(Node<E> root){
		Node<E> rtemp = root;
		Node<E> Rtemp = root.right.left;
		root=rtemp.right;
		root.left=rtemp;
		root.left.right=Rtemp;
		
	}
	
	public void rotateRight(Node<E> root) {
		Node<E> rtemp = root;
		Node<E> Ltemp = root.left.right;
		root=rtemp.left;
		root.right=rtemp;
		root.right.left=Ltemp;
	}
	
	public boolean search(E data) { 
		if(root==null) 
			return false; 
		Node<E> temp = root; 
		Stack<Node<E>> stack = new RStack<>();  
		while(!stack.empty()|| temp != null) { 
			if(temp != null) {
				if(temp.data.compareTo(data)==0)
					return true;
				stack.push(temp);
				temp = temp.left;
			}
			else {
				temp = stack.pop();
				temp = temp.right;
			}
		}
		return false;
	}

}



















interface Stack<E> extends Iterable<E> {
    boolean empty();
    E peek();
    E pop();
    void push(E data);
}

class RStack<E> implements Stack<E> {

    private class Node<T> {
        private Node(T data) {
            this.data = data;
        }
        private T data;
        private Node<T> next;
    }

    public boolean empty() {

        return head == null;
    }

    public Iterator<E> iterator() {

        return new Iterator<E>() {
            public boolean hasNext() {
                return curr != null;
            }
            public E next() {
                E temp = curr.data;
                curr = curr.next;
                return temp;
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
            private Node<E> curr = head;
        };
    }

    public E peek() {

        E temp = pop();
        push(temp);
        return temp;
    }

    public E pop() {

        E temp = null;
        
        if (head != null) {
            temp = head.data;
            head = head.next;
        }

        return temp;
    }

    public void push(E data) {

        Node<E> temp = new Node<E>(data);
        temp.next = head;
        head = temp;
    }

    private Node<E> head;
}
