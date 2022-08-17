package VaraibleStudy;

public class globalandLocalVariable {
	//non-static global variable
	int a=90;//1+2 declaration + assign value
	//static global variable 
	static int b=10;//1+2 declaration + assign value

	public static void main(String[] args) {
		globalandLocalVariable g=new globalandLocalVariable();
		//objectname.methodname
		g.test();// calling non static method from same class
		//methodname
		test1();//calling static method from same class
		System.out.println("global value of a is "+g.a);// calling non-static global variable from same class
		System.out.println("global value if b is"+b);//calling static global variable from same class
		

		int sum=10+g.a;// usage of non static global variable from same class
		System.out.println("sum is "+sum);
		int sub=100-b;// usage of static global variable from same class
		System.out.println("sub is "+sub);
		
		//calling non static global variable form another class
		// need to create object of another class(sample class)
           //classname.objectname=new classname
		sample h=new sample();
		System.out.println("value of non static global variable is"+h.p);//calling non static global variable form another class
		System.out.println("value of non static global variable is"+h.q);//calling non static global variable form another class
		


	}
public void test()//non static Regular method
{
int a=80;// local variable
int sum=a+100;//1+2 declaration + assign value
System.out.println("sum is "+sum);
}

public static void test1()//static Regular method
{
	int a=30;
	int b=40;
	int sum=a+b;
	int sub=a-b;
	System.out.println("sum of a & b is "+sum);
	System.out.println("sub is equal to "+sub);
	
}
}