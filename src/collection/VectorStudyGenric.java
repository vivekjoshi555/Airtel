 package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudyGenric {

	public static void main(String[] args)
	{
		
		//created object of vector class
		Vector v = new Vector();
		
		v.add(123);
		v.add("Vivek");
		v.add("Advait");
		v.add(992324);
		v.add('P');
		v.add(53.45);
		v.add(null);
		v.add(true);
		v.add('s');
		v.add('P');
		
		System.out.println(v);
		System.out.println(" ");
		System.out.println("==================================="); 
		
		//1. Size Method
		System.out.println("size of Vector list= "+ v.size());
		System.out.println("==================================="); 
		
		//2.get Method
		System.out.println(v.get(1));
		
		//3. Index of and Last Index of
		System.out.println("===================================");
		System.out.println(v.indexOf("Advait"));
		System.out.println(v.indexOf('P'));
		System.out.println(v.lastIndexOf('P'));
		
		//4. contains 
		System.out.println("===================================");
		System.out.println(v.contains(53.45));
        System.out.println(v.contains('P'));
        
      //5. Remove Method
    	System.out.println("===================================");
    	System.out.println(v.remove(0));
        
      //6.Add Method
    	System.out.println("===================================");
    	v.add(1,"vaibhav");//for addintion no need of add method in syso
    	System.out.println(v);//for to see syso required
    	
    	//7. static or hard coding
    	System.out.println("===================================");
    	System.out.println(v.get(0));
    	System.out.println(v.get(1));
    	System.out.println(v.get(2));
    	System.out.println(v.get(3));
    	System.out.println(v.get(4));
    	System.out.println(v.get(5));
    	System.out.println(v.get(6));
    	System.out.println(v.get(7));
    	System.out.println(v.get(8));
    	System.out.println(v.get(9));
    	
    	
    	//8. printing element using for loop (Dynamic coding)
    	System.out.println("===================================");
    	for(int i=0;i<=v.size()-1;i++)

    	{
    		System.out.println(v.get(i));
    	}
    	
    	//8. Dynamic coding
    	System.out.println("===============Incremental=================");
    	
    	for(int i=0;i<=9;i++)
    	{
    		System.out.println(v.get(i));
    	}
    	System.out.println("===============Decremental=================");
    	
    	for(int i=9;i>=0;i--)
    	
    	{
    		System.out.println(v.get(i));
    	}
    	 //9. For each Loop 
        System.out.println("===============For each loop=================");
        
    	for(Object vi:v)
    	{
    		System.out.println(vi);
    	}
    	//10. iterator 
    	System.out.println("===============Iterator=================");
    	Iterator vi = v.iterator();
    	
    	while(vi.hasNext())
    	{
    		System.out.println(vi.next());
    	}
    	
    	//11. Listiterator 
    	System.out.println("===============ListIterator=================");
    	ListIterator li = v.listIterator();
    	while (li.hasNext())
    	{
    		System.out.println(li.next());
    	}
    	
    	//12. enumration
    	System.out.println("===============enumeration=================");
    	System.out.println("====OutPut using enumration===");

    	Enumeration el = v.elements();
    	while(el.hasMoreElements())
    	{
    		System.out.println(el.nextElement());
    	}
	}

}
