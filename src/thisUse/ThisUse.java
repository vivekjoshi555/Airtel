package thisUse;

public class ThisUse {
     int a=30;//non static Global variable
     int b=50;//non static gobal variable
     static int c=40;//static global variable
     
	public static void main(String[] args) 
	{
		
		ThisUse tu=new ThisUse();//Created object of same class
				tu.test();//objectname.methodname of same class
		

	}
	
	public void test()
	{
		int a=20;//Local Variable
		int sum=a+80;
		System.out.println(sum);
	
		int sum1=this.a+80;//a value is global value
		System.out.println(sum1);
		
		int sum2=this.b+50;
		System.out.println(sum2);//b is global value
		
		int c=40;
	
		
		System.out.println("Local value of a is "+a);
		System.out.println("Global value of a is "+this.a);
		System.out.println("value of static global variable is "+c);
		
	}

}
