package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) 
	{
		//created object of Linkedlist class
		
		LinkedList ll = new LinkedList();
		
		ll.add("India");
		ll.add("Maharashtra");
		ll.add("+91");
		ll.add(12345);
		ll.add(null);
		ll.add(true);
		ll.add(null);
		ll.add('M');
		ll.add(56.78);
		ll.add(2345);
		
		System.out.println(ll);
		System.out.println("==================================="); 
		//1. Size Method
		System.out.println(ll.size());
		//2.get Method
		System.out.println(ll.get(1));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		//3. Index of and Last Index of
		System.out.println("==================================="); 
		
		System.out.println(ll.indexOf("+91"));
		System.out.println(ll.lastIndexOf(2345));
		System.out.println(ll.indexOf(null));
		System.out.println("==================================="); 
		
		System.out.println(ll);
		System.out.println(ll.get(7));
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		
		
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		System.out.println(ll.pollLast());
		System.out.println(ll);
		System.out.println("===================================");
		//for loop// for each// iterator// listIterator
		
	//for loop
	    for(int i=0;i<=6;i++)
	    {
	    	System.out.println(ll.get(i));
	    }
		System.out.println("===================================");
	 //for each
	      for(Object l:ll)
	      {
	    	  System.out.println(l);
	      }
	      System.out.println("===================================");
	  // iterator
	      Iterator it = ll.iterator();
	      while(it.hasNext())
	      {
	    	  System.out.println(it.next());
	      }
	      System.out.println("===================================");
	  // listIterator
	      
	    ListIterator li = ll.listIterator();
	    while(li.hasNext())
	    {
	    	System.out.println(li.next());
	    }
	    System.out.println("===================================");
	}

}
