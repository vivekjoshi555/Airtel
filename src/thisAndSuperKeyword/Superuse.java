package thisAndSuperKeyword;

public class Superuse extends A{
      int m=10;//Global variable superuse
	public static void main(String[] args) 
	{
		Superuse su=new Superuse();
		su.test();

	}
      public void test()
      {
      int m=1;
      int sum=m+10;//Using local vlaue of m
      int sum1=this.m+10;//using global value of m from same class
      int sum2=super.A+10;//using global value of m from super class
      
      System.out.println("using local value of m"+sum);
      System.out.println("using global value of m"+sum1);
      System.out.println("suing global value of m"+sum2);
}
}