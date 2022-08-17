package arraystudy;

public class Multidiamensionalarray {

	public static void main(String[] args) 
	{
	//1. Array decleration
		int a[] [] =new int [2][2];
		
     //2. Assign Value
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
	  //3.Usage
		
		//System.out.println(a[0][0]);
		//System.out.println(a[0][1]);
		//System.out.println(a[1][0]);
		//System.out.println(a[1][1]);
		
		//I want to write in matrix form
		
		System.out.print(a[0][0]+" ");
		System.out.println(a[0][1]);
		System.out.print(a[1][0]+" ");
		System.out.print(a[1][1]);
	
		System.out.println(" ");
		System.out.println("=====================================");
		
		for(int i=0;i<=1;i++) // this for loop for row--> outer for loop//i=0,1,2
		for(int j=0;j<=1;j++) // this for loop for column--> inner for loop//j=0,1,2

		{
			System.out.println(a[i][j]);//a[0][0], a[0][1],a[1][0],a[1][1]
		}
	}

}
