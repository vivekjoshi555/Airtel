package abstractclass;

public class CC extends A {
	
public static void main(String[] args) 
{
		CC c=new CC();//created object of concrete class
		c.demo1();
		c.demo2();
		c.demo3();
		c.demo4();
		c.demo5();

}	
@Override
	public void demo3()
    {
		System.out.println("demo 3 is method");
		
	}
@Override
	public void demo4()
    {
		System.out.println("demo 4 is method");
		
	}
@Override
	public void demo5() 
    {
		System.out.println("demo 5 is method");
		
	}
		
	

	
 

	
}
