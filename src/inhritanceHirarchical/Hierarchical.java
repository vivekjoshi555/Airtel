package inhritanceHirarchical;

public class Hierarchical {
	public static void main(String[] args) 
	{
		A a=new A();//object of A class
		a.test1();//using A class object calling A class method
		
		System.out.println("==================");
		
		B b=new B();//object of B class
		b.test2();//using B class object calling B class method
		b.test1();//using B class object calling A class method
		
		System.out.println("=====================");
		
		C c=new C();//object of C class
		c.test3();//using C class object calling C class method
		c.test1();//using C class object callling A class method 
	   
		System.out.println("==================== ");
		
	}

}
