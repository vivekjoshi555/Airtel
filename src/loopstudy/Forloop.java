package loopstudy;

public class Forloop {
	public static void main(String[] args) {
		
//		for(initialize; condition; increament/decrement)
		
		// 1...2...3...4..5
		for (int a=1;a<=5;a++)//Incremental
			
			
			System.out.println(a);
		System.out.println("====================================");
		
//		for(initialize; condition; increament/decrement)
		//want to print 2..4..6..8..10...20
		
		for (int b=2;b<=20;b=b+2)//Incremental
		System.out.println(b);	
		System.out.println("========================================");
		
//		for(initialize; condition; increament/decrement)
		//want to print 20...18...16...14...2
		
		for (int c=20;c>=2;c=c-2)//decremental
		System.out.println(c);
		
	
	
		
	}

}
