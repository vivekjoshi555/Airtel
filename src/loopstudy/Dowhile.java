package loopstudy;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// I want to print 1.2.3.4.........10
     int i=1;
     do {
   System.out.println(i);
   
   i++;//Incremental
     }
     while (i<=10);
     System.out.println("=============================================");
     
     // If i want to print 4.8.12.16......40
     int a=4;
     do {
    	 System.out.println(a);
    	 a=a+4;//incremental
     }
     while (a<=40);
     System.out.println("=====================================================");
     
     }
	}
	
	


