package constructorMethod;

public class UserDefindWithString {
	// example of user defined constructor
	String city="name"; // variable declaration manualy
     
  // use of constructor --> to initiazite variable
	
	String name;// variable declration
     
	public UserDefindWithString() // user defined constructor--> without parameters
     {
    	 name="Vivek";
     }
	


	public static void main(String[] args)
	{
		display1 ();//static method call from same class
		UserDefindWithString a=new UserDefindWithString();//object creation
		a.display();

	}
	
	public void display()
	{
	System.out.println("I am non static display method");
	System.out.println("my city name is "+city);
	System.out.println("my name is "+name);
    }
    public static void display1 ()
    {
    	System.out.println("I am  static display1 method");
    }
	

}
