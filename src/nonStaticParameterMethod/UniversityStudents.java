package nonStaticParameterMethod;

public class UniversityStudents {

	public static void main(String[] args)
	{
		//object creation
		//classname.objectname=new classname();
		UniversityStudents n=new UniversityStudents();
		//Non static method with same class with non parameter and parameter method
		//objectname.methodname();
		n.studentInfo();
		n.studentInfo("Vivek", "PV12345", "Mechanical engg", "Mechanical", 'M',"2014",54.64f);
		n.studentInfo("piyush", "PV123456", "Electrical engg", "Electrical", 'M',"2013",60.64f);
		
		
		
		//name, PRN, branch, dept, gender, passoutyear, weight
	}
		//Non static method without Parameter or Zero Parmeter
		public void studentInfo()
		{

			String name;
			name="Vivek";
			
			String PRN;
			PRN="PV1234";
			
			String branch;
			branch="Mechanical engg";
			
			String department;
			department="Mechanical";
			
			char gender;
			gender='M';
			
			String passoutyear;
			passoutyear="2014";
			
			Float weight;
			weight=54.64f;
			
		
			System.out.println("my name is "+name);
			System.out.println("my PRN number is "+PRN);
			System.out.println("my branch is "+branch);
			System.out.println("my department is "+department);
			System.out.println("my gender is "+gender);
			System.out.println("my passoutyear is "+passoutyear);
			System.out.println("my weight is "+weight);
			System.out.println("------------------");
			
					
			

	}
		//Non static method with Parameter method
		public void studentInfo(String name, String PRN, String branch, String department, char gender, String passoutyear, Float weight)
		{
			System.out.println("my name is "+name);
			System.out.println("my PRN number is "+PRN);
			System.out.println("my branch is "+branch);
			System.out.println("my department is "+department);
			System.out.println("my gender is "+gender);
			System.out.println("my passoutyear is "+passoutyear);
			System.out.println("my weight is "+weight);
			System.out.println("------------------");
		}
}
