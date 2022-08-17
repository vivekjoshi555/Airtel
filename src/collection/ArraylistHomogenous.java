package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistHomogenous {

	public static void main(String[] args) 
	{
	
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(1);
		al.add(5);
		al.add(3);
		al.add(7);
		al.add(3);
		
		System.out.println(al);
		
		System.out.println("=============================================");
		System.out.println("====================for each=========================");
		//for each
		
		for(Integer a:al)
		{
			System.out.println(a);
		}
		
		System.out.println("=============================================");
		System.out.println("==================== Iterator =========================");
		
		//Iterator
		
		Iterator<Integer> it = al.iterator();
		
		while(it.hasNext())
		
		{
			System.out.println(it.next());
		}
		System.out.println("=============================================");
		System.out.println("==================== ListIterator =========================");
		
		//Listiterator
		
		ListIterator<Integer> li = al.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}

}
