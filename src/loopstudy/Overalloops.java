package loopstudy;

public class Overalloops {

	public static void main(String[] args) 
	{
	for (int a=5;a<=50;a=a+5) //1 for loop ---incremental
	{
		System.out.println(a);	
	}
	System.out.println("----------------------------------------------");
	
	
	for (int a=40; a>=4; a=a-4)//1 for loop---decremental
	{
		System.out.println(a);
	}
	System.out.println("-----------------------------------------------");
	
	
	int b=3;// 2 while loop ---incremental
	while (b<=30)
	{
		System.out.println(b);
		b=b+3;
	}
	
	System.out.println("--------------------------------------------------");
	
	int c=20; // 2 while loop decremental
	while (c>=2)
	{
		System.out.println(c);
		c=c-2;
	}
	System.out.println("--------------------------------------------------");
	
	
	int d=6; //3 do while loop ---incremental
	do
	{
		System.out.print(d+" ");// if remove ln it will show horizontally
	d=d+6;
	}
	while (d<=60);
	
	System.out.println("-------------------------------------------------------");
	
	int e=70;//2 do while loop decremental
	do
	{
		System.out.println(e);
		e=e-7;
	}
	while (e>=7);


	}

}
