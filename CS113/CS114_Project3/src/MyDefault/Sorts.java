package MyDefault;

import java.util.*;

public class Sorts {
	
    public static <T extends Comparable<? super T>> void heapSort(T[] array) {
    	ArrayList<Node<T>> list = buildMaxHeap(array);
    	
    	int n= array.length-1;
    	for(int i = n; i>0; i--) {
    		T temp = array[1];
    		array[1] = array[i];
    		array[i] = temp;
    		n--;
    	}
    	
    	
    	heapify(list.get(0));
    	
    }

    
    public static <T extends Comparable<? super T>> ArrayList<Node<T>> buildMaxHeap(T[] array) {
    	
    	ArrayList<Node<T>> list = new ArrayList<Node<T>>();
    	
    	for(int i = 0; i<array.length; i++) {//creates array list of Node<T> with indexes and data from given array 		
    		list.add(new Node(i, array[i]));
    	}
    	for(int i = 0; i<list.size(); i++){//establishes parents and children of heap structure
    		if(i != 0){
    			list.get(i).parent = list.get((i-2)/2);
    		}
    		if(2*i+2<list.size()) {
    			list.get(i).left = list.get(2*i+1);
    			list.get(i).right = list.get(2*i+2);
    			if(list.get(i).left.data.compareTo(list.get(i).data)>0) {
    				swap(list.get(i).left,list.get(i));
    			}
    			if(list.get(i).right.data.compareTo(list.get(i).data)>0) {
    				swap(list.get(i).right,list.get(i));
    			}
    		}
    		else if(2*i+1<list.size()) {
    			list.get(i).left = list.get(2*i+1);
    			if(list.get(i).left.data.compareTo(list.get(i).data)>0) {
    				swap(list.get(i).left,list.get(i));
    			}
    		}
    	}
    	
    	//for i = floor(n/2) to 1    ???
    	for(int i = list.size()-1; i>0; i--) {
    		heapify(list.get(i));
    	}
    	
    	return list;
    }
    
    public static <T extends Comparable<? super T>> void heapify(Node<T> curr) {
    	
    	Node<T> max = null; 
    	
    	if(curr.left !=null && curr.left.data.compareTo(curr.data)>0){
    		max = curr.left;
    	}
    	
    	else {
    		max = curr;
    	}
    	
    	if(curr.right !=null && curr.right.data.compareTo(max.data)>0) {
    		max = curr.right;
    	}
    	
    	if(max != curr ) {
    		swap(curr, max);
    		heapify(max);
    	}
    }
    
    public static <T extends Comparable<? super T>> void swap(Node<T> a, Node<T> b) {
    		Node<T> temp = a;
    		a.left = b.left;
    		a.right = b.right;
    		a.parent = b.parent;
    		a.data= b.data;
    		a.index = b.index;
    		b.left = temp.left;
    		b.right = temp.right;
    		b.parent = temp.parent;
    		b.data = temp.data;
    		b.index = temp.index;
    		
    }
	  		
    
}


class Node<T> {
	        Node(int index, T data) {
	            this.index = index;
	        	this.data = data;
	            
	        }
	        protected int index;
	        protected T data;
	        protected Node<T> parent;
	        protected Node<T> left;
	        protected Node<T> right;
	} 








