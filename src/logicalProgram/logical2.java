package logicalProgram;

public class logical2 {

	public static void main(String[] args) {
		// i want to print 10*10 rectangle by star pattern
		for (int i=1;i<=10;i++)//outer loop // for rows//incremental
		{
			for (int j=1;j<=i;j++)//for inner loop// for columns//incremental
			{
				System.out.print("* ");
			}
			System.out.println();
		}
System.out.println("===============================================");

    //i want to print 10*10 rectangle by star pattern in reverse

     for (int i=1;i<=10;i++)//outer loop // for rows // Decremental
      {
	for (int j=10;j>=i;j--)//for inner loop// for columns
	{
		System.out.print("* ");
	}
	System.out.println();
	
      }
     System.out.println("===============================================");
	
	
	for (int i=1;i<=10;i++)
	{
		for (int j=1;j<=1;j++)
		{
			System.out.print("1 ");
		}
		System.out.println();
	}
System.out.println("===============================================");
	
	
	// i want to print 10*10 rectangle by star pattern
			for (int i=2;i<=10;i++)//outer loop // for rows//incremental
			{
				for (int j=1;j<=i;j++)//for inner loop// for columns//incremental
				{
					System.out.print("* ");
				}
				System.out.println();
			}
	System.out.println("===============================================");

}
}