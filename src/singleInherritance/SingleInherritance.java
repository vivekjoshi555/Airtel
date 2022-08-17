package singleInherritance;

public class SingleInherritance {

	public static void main(String[] args) {
		Mother m=new Mother();//object creation for mother
		m.nature();
		
		
		System.out.println("===========================");
		
		Son s=new Son();// object creation for son//creating object of child class
		s.mobile();//using own property//calling non static method
		s.nature();//using superclass property//calling non static method
		s.name();//using superclass property//calling non static method
        Mother.look();//calling static method //classname.methodname
        Son.laptop();//calling static method //classname.methodname

	}

}
