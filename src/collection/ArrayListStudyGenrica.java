 package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudyGenrica {

	public static void main(String[] args)
    {
	ArrayList al = new ArrayList();// created object of ArrayList
    al.add("Maharashtra");
    al.add(1992);
	al.add(99.99);
	al.add(null);
	al.add(null);
	al.add("Velocity");
	al.add("Velocity");
	al.add(true);
	al.add('A');
	
	System.out.println(al);
	//1. Size Method
	System.out.println("Size of array list= "+al.size());
	System.out.println("======================================");
	
	//2.get Method
	System.out.println(al.get(1));
	System.out.println("======================================");
	
	//3. Index of and Last Index of
	System.out.println(al.indexOf('A'));
	System.out.println(al.indexOf("Velocity"));
	System.out.println(al.indexOf("Velocity"));
	System.out.println(al.lastIndexOf("Velocity"));
	System.out.println("======================================");
	
	//4. contains 
	System.out.println(al.contains('A'));
	System.out.println(al.contains(99.99));
	System.out.println(al.contains("Maharashtra"));
	System.out.println("======================================");
	
	//5. Remove Method
	System.out.println(al.remove(1));//index basis
	System.out.println(al);
	System.out.println("======================================");
	
	//6.Add Method
	al.add("Amravati");
	System.out.println(al);
	al.add(4, "Advait");
	System.out.println(al);
	System.out.println("======================================");
	
	//7. static or hard coding
	System.out.println(al.get(0));
	System.out.println(al.get(1));
	System.out.println(al.get(2));
	System.out.println(al.get(3));
	System.out.println(al.get(4));
	System.out.println(al.get(5));
	System.out.println(al.get(6));
	System.out.println(al.get(7));
	System.out.println(al.get(8));
	System.out.println(al.get(9));
	System.out.println("======================================");
	
	//8. Dynamic coding
	System.out.println("===============Incremental=================");
	
	for(int i=0;i<=9;i++)
	{
	System.out.print(al.get(i)+" ");
	}
	System.out.println(" ");
	System.out.println("===============Decremental=================");
	
	for(int i=9;i>=0;i--)
	{
		System.out.print(al.get(i)+" ");
	}
	System.out.println(" ");
	System.out.println("===============================");
	
	System.out.println( al.size());
	System.out.println("===============================");
	
	//9. printing element using for loop (Dynamic coding)
	
    for(int i=0;i<=al.size()-1;i++)
     {
	System.out.println(al.get(i));
     }
    
    //10. For each Loop 
    System.out.println("===============For each loop=================");
    
	for (Object a:al)
	{
		System.out.print(" "+(a));
	}
	
	//11. iterator 
	System.out.println(" ");
    System.out.println("===============iterator=================");
	
    Iterator it = al.iterator();
    
    while(it.hasNext())
	
    {
    	System.out.println(it.next());
    }
	
 //12. Listiterator 
 	System.out.println(" ");
     System.out.println("===============Listiterator=================");
 	
	ListIterator li = al.listIterator();
	
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	
	
	
    }	
}
