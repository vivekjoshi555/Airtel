package loopstudy;

public class While {

	public static void main(String[] args) {
	// I want to print 1.2.3.....10
		int a=1;
		while (a<=10)
		{
		System.out.println(a);//1,2,3,4.......10
         a++;//Incremental
         }
		System.out.println("====================================");
		
	// I want to print 10.9.8.7.....1
				int d=10;
				while (d>=1)
				{
				System.out.println(d);//10.9.8.7....1
		         d--;//Decremental
		         }
				System.out.println("====================================");
				
	// I want to print 20.18.16.14......2
				int e=20;
				while (e>=1)
				{
				System.out.println(e);//10.9.8.7....1
		         e=e-2;//Decremental
		         }
				System.out.println("====================================");
				
	//I want to print 20,18,16,14.......2	
		int b=20;
	    while (b>=2)
	    {
	    	System.out.println(b);
	    	b=b-2;//decremental
	    }
	    System.out.println("======================================");
	  // I want to print table of 3
	    
	    int c=3;
	    while (c<=30)
	    {
	    	System.out.println(c);
	    	c=c+3;//Incremental
	    }
	    System.out.println("======================================");
		  // I want to print table of 3
		    
		    int f=3;
		    while (f<=30)
		    {
		    	System.out.print(f +" ");//for space required type (+" ")
		    	f=f+3;//Incremental
		    }
	}

}
