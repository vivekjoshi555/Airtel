package constructorMethod;

public class ConstructorWithParameter
     {
	
	//user define single parameter
	int a;
	int b;
    int c;
    
    public ConstructorWithParameter()
    {
    	a=10;
    	b=20;
    	c=30;
    }
    
    public ConstructorWithParameter(int x,int y,int z)
    {
    a=x;
    b=y;
    c=z;
    }
	
	public static void main(String[] args) {
		
		ConstructorWithParameter u=new ConstructorWithParameter();
				u.sample();
		ConstructorWithParameter u2=new ConstructorWithParameter(50, 60, 70);
		       u2.sample();
	}
	
	public void sample()
	{
		int sum;
		sum=a+b+c;
		
		System.out.println("the sum is "+sum);
	}

}
