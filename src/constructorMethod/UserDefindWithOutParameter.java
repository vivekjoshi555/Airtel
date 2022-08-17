package constructorMethod;

public class UserDefindWithOutParameter
  {
	int a;//Variable deceleration
	int b;
	
	public UserDefindWithOutParameter()
	{
		a=40;
		b=30;
		System.out.println("this is user defind constructor");
	}

	public static void main(String[] args) 
	{
		//classname.objectname=new classname();
		UserDefindWithOutParameter w=new UserDefindWithOutParameter();
		//objectname.methodname
		w.add();

	}
    public void add()
    {
    	//1.Variable decleration
    	int add;
    	//2.Variable assign
    	add=a+b;
    	//3.usage
    	
    	
    	System.out.println("addition is "+add);
    }
}
