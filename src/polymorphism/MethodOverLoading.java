package polymorphism;

public class MethodOverLoading {

	public static void main(String[] args) 
	{
		MethodOverLoading mu=new MethodOverLoading();
		
		mu.add();
		mu.add(30);
        mu.add(20, 30);
         
	}
public void add()
{
	int a=10;
	int b=20;
	int sum=a+b;
		
	System.out.println("the sum of a & b is"+sum);
}
public void add(int a)
{
	a=30;
	int sum=a+10;
	System.out.println("sum is "+sum);
}
public void add(int a,int b)
{
	int sum=a+b;
	System.out.println("sum of a & b is "+sum);
}
}
