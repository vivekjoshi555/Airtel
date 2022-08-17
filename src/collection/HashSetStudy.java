 package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		
		hs.add(12345);
		hs.add(null);
		hs.add("Vivek");
		hs.add(null);
		hs.add("Vivek");
		hs.add("BE Mechanical");
		hs.add(69.78);
		hs.add('A');
		
		System.out.println(hs);
		System.out.println("==================================="); 
		
		//1. Size Method
		System.out.println(hs.size());
		System.out.println(" ");
		System.out.println("===================================");
		System.out.println("==============Contains method=====================");
		
		//2. Contains Method
		System.out.println(hs.contains("BE Mechanical"));
		System.out.println("===================================");
		
		//3. Index of and Last Index of
	    hs.isEmpty();
		System.out.println(hs);
		System.out.println("==============Add method====================");
		
		//4.Add Method22
		hs.add(998725711);
		System.out.println(hs);
		hs.add("joshi");
		System.out.println(hs);
		System.out.println("================Remove Method===================");
		
		//5.Remove Method
		hs.remove("joshi");
		System.out.println(hs);
	
		
		//does not support for loop ----->get method is not availabe
		//For Each
		System.out.println("==============for each =====================");
		
        for(Object h:hs)
        {
        	System.out.println(h);
        }
        //Iterator
    	System.out.println("==============Iterator=====================");
        
        Iterator hi = hs.iterator();
        
       while(hi.hasNext())
       {
    	   System.out.println(hi.next());
        }
    	
       
       
	}

}
