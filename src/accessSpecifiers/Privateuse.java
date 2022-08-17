package accessSpecifiers;

public class Privateuse {

	public static void main(String[] args) {
		Privateuse pu=new Privateuse();//create object of class
		pu.test1();//can be access within project
		pu.test2();//can be access within class
		pu.test3();//can be access within package
		pu.test4();//
		
	}
		public void test1()//can be access within project
		{
			System.out.println("public test 1 method");
		}
		
		private void test2()//can be access within class
		{
			System.out.println("private test2 method");
		}
		
		void test3()//can be access within package
		{
			System.out.println("default test3 method ");
		}
        protected void test4()//protected access within package/outside package by using inherritance
        {
        	System.out.println("this is protected test 4");
        }
	}


