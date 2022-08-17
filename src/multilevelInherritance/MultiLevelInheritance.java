package multilevelInherritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {

	Son S=new Son();//create object of son class
	S.receipe();//using sons object calling grandmother method
	S.name();//using sons object calling grandmother method
	S.education();//using sons object calling sons own method
	
	// to call static method
	Son.instituation();//using son calss calling sons methodname//classname.methodname
	Son.birthplace();//using son class calling mother methodname//classname.methodname
	Son.stories();//using sons class calling grand mother methodname//classname.methodname

	}

}
