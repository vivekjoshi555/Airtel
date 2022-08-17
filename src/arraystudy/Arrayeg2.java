package arraystudy;

public class Arrayeg2 {

	public static void main(String[] args)
	
	{
		
int rollnum[]=new int[6];
//1+2 decleration +initialization
System.out.println(rollnum[4]);
int rollnum1[]= {1,2,3,4,5,6,7};
System.out.println(rollnum1[4]);

	System.out.println("=================");
//Static coding
	for(int i=0;i<=5;i++)
	{
		System.out.println(rollnum1[i]);
	}
	System.out.println("=================");
	
//dynamic coding in incremental order
	
	for (int i=0;i<=rollnum1.length-1;i++)
	{
		System.out.println(rollnum1[i]);
	}
	System.out.println("=================");
//dynamic coding in decremental order
	for (int i=rollnum1.length-1;i>=0;i--)
	{
		System.out.println(rollnum1[i]);
	}
}
}