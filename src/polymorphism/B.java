package polymorphism;

public class B extends A
{

	public static void main(String[] args) 
	{
		A a=new A();
		B b=new B();
		
		//Method Overriding- its example of Runtime polymorphism
		
		a.test();
		b.test();

	}
public void test()
{
	System.out.println("B test method");
}

}
