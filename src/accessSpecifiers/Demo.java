package accessSpecifiers;

public class Demo {

	public static void main(String[] args) {
		
		Privateuse P=new Privateuse();// created object of another class
		P.test1();//calling public test1 method
		// P.test2()// private methods can be called only within class//it will not run
		P.test3();// default methods can be accessed within package
        P.test4();// Protected methods can be accessed withing package

	}

}
