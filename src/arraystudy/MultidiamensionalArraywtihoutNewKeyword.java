package arraystudy;

public class MultidiamensionalArraywtihoutNewKeyword 
{

	public static void main(String[] args) {
		char grade[][]={{'A','B','C','D'},{'E','F','G','H'},{'I','J','K','L'}};
		{
for(int i=0;i<=2;i++)//outer loop-row
{
	for (int j=0;j<=3;j++)//inner loop-column
	{
System.out.print(grade[i][j]+" ");
	}
	System.out.println();
}
}
}
}