package arraystudy;

public class Array {
	
	public static void main(String[] args) {
		
		//I want to store city name
	
		//1. Array Decleration
		String city[]=new String[5];
		//2.Array Initalized
		city[0]="pune";
		city[1]="Dhule";
		city[2]="Beed";
		city[3]="Thane";
		city[4]="Goa";
		
		//3.usage
		System.out.println(city[3]);
		
		System.out.println("======================================");
		for(int i=0;i<=4;i++)// in ascending order//also called static coding
			{
			System.out.println(city[i]);
			
			}
		System.out.println("======================================");
		for (int i=4;i>=0;i--)//in descending order//also called static coding
		{
			System.out.println(city[i]);
		}
		System.out.println("======================================");
		
		for (int i=0;i<=city.length-1;i++);
		{
			System.out.println(city[3]);
		}
		for (int i=city.length-1; i>=0;i--);
		{
			System.out.println(city[4]);
		}

	}

}
