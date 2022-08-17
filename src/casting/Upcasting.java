package casting;

public class Upcasting {

	public static void main(String[] args) 
	{
		Father f=new Father();
		Son s=new Son();
		
		f.car();
		f.bike();
		System.out.println("---------------------");
		
		s.car();
		s.bike();
		System.out.println("--------------------");
		
		Father F1=new Son();//creating object of subclass and giving superclass reference
		F1.bike();//eligible for casting
		F1.car();//eligible for casting
		//f.Degree();//not eligible for casting as its not common/ superclass method

	}

}
