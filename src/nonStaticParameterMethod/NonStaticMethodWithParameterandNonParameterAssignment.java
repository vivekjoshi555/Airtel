package nonStaticParameterMethod;

public class NonStaticMethodWithParameterandNonParameterAssignment {

	public static void main(String[] args) {
		
		
		//1.name 2. age 3.gender 4.weight 5.rollnum
		//non static method with zero parameter and parameter in same class
		//classname.objectname=new classname();
		NonStaticMethodWithParameterandNonParameterAssignment n=new NonStaticMethodWithParameterandNonParameterAssignment();
		//call from same class
		//objectname.methodname
		//non static method with zero parameter in same class
		n.studenInfo();
		//non static method with parameter in same class
		n.studenInfo("Vivek",30,'M',60.4F,12345);
		//direct given feed information in above syntex and output will get
		n.studenInfo("Rahul",34,'M',80.4F,123456789);

	}
	public void studenInfo()
	{
		String name;
		name="Vivek";
		
		int age;
		age=30;
		
		char gender;
		gender='M';
		
		float weight;
		weight=60.4f;
		
		int rollnum;
		rollnum=12345;
		
		System.out.println("my name is "+name);
		System.out.println("my age is "+age);
		System.out.println("my gender is "+gender);
		System.out.println("my weihgt is "+weight);
		System.out.println("my rollnumber is "+rollnum);
		System.out.println("------------------------");
	}
	public void studenInfo(String name, int age,char gender,float weight,int rollnum)
	{
		System.out.println("my name is "+name);
		System.out.println("my age is "+age);
		System.out.println("my gender is "+gender);
		System.out.println("my weihgt is "+weight);
		System.out.println("my rollnumber is "+rollnum);
		System.out.println("-------------------");
	}
	

}
