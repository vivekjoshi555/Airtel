package metohod;

public class nonstaticmethodcall
{

	public static void main(String[] args) 
	{
		//classname objectname= new classname();.
		
		nonstaticmethodcall n=new nonstaticmethodcall();// created object of a class
		
		//to call non static methods from same class
		// objectname.methodname();
		n.test();//calling non static method from same class
        
		
		// calling non static method of another or from different class--> need to create object of that class
		
		//classname objectname= new classname();.
		nonstaticmethodcall1 m=new nonstaticmethodcall1();// created object of a class
		
		//to call non static methods from another class
		// objectname.methodname();
		m.test2();
		
		//classname objectname= new classname();.
		
				
	}
		
	
	
	
public void test()
{
     
	//1.Variable decleration
	  int a;
      int b;
      int add;
      int sub;
      
      //2.assign

      a=5;
      b=10;
      add=a+b;
      sub=a-b;
      
	
	// non static regular method
    //3.usage
	System.out.println("this is test  method");
	System.out.println("addtion is "+add);
	System.out.println("subtraction is "+sub);
}
}



	
	

	
	
	

