package MyDefault;

import java.util.Iterator;

public class BinarySearchTree3<E extends Comparable<? super E>> extends BinaryTree<E>{

	public Iterator<E> iterator() {
		
		traverseInOrder(root);
		
		return null;
	}

	public void traverseInOrder(Node<E> node) {
		    if (node != null) {
		        traverseInOrder(node.left);
		        System.out.print(" " + node.data);
		        traverseInOrder(node.right);
		    }
	}    
	
	public void insert(E data) {
		insert(root,data);
	}
	
	private Node<E> insert(Node<E> current, E data) {//recursive
	    if (current == null) {
	        return new Node(data);
	    }
	 
	    if (data.compareTo(current.data)<0) {
	        current.left = insert(current.left, data);
	    } else if (data.compareTo(current.data)>0) {
	        current.right = insert(current.right, data);
	    } else {
	        // data already exists
	        return current;
	    }
	 
	    return current;
	}
	
	
	@Override
	public void remove(E data) {
		remove(root,data);
	}
	
	private Node<E> remove(Node<E> current, E data) {
	    if (current == null) {
	        return null;
	    }
	 
	    if (data.compareTo(current.data)==0) {
	    	if (current.left == null && current.right == null) {
	    	    return null;
	    	}
	    	if (current.right == null) {
	    	    return current.left;
	    	} 
	    	if (current.left == null) {
	    	    return current.right;
	    	}
	    	
	    } 
	    if (data.compareTo(current.data)<0) {
	        current.left = remove(current.left, data);
	        return current;
	    }
	    current.right = remove(current.right, data);
	    return current;
	}

	public boolean search(E data) {
		return search(root,data);
	}
	
	private boolean search(Node<E> current, E data) {//recursive
	    if (current == null) {
	        return false;
	    } 
	    if (data.compareTo(current.data)==0) {
	        return true;
	    } 
	    return data.compareTo(current.data)<0
	      ? search(current.left, data)
	      : search(current.right, data);
	}
	
}
