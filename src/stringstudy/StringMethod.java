package stringstudy;

public class StringMethod {

	public static void main(String[] args) 
	{
		String s="hi";// created string without using new Keyword
		String s1=new String ("hello");//created using new keyword
	
		//1. use of length method

		System.out.println(s.length());
		System.out.println(s1.length());
		
		int a = s.length();// store
		int b = s1.length();
		System.out.println(a);
		System.out.println(b);
		
		String s2=" ";
		System.out.println(s2.length());
		
		//String s3=null;
		//System.out.println(s3.length());
		System.out.println("=============================================");
		
		//2. use of touppercase () Method
		
		String c = "velocity";
		System.out.println(c);
		System.out.println(c.toUpperCase());
		
		String myclass = c.toUpperCase();// store
		System.out.println(myclass);
		System.out.println("=============================================");
		
		//3. use of Lowercase () Method
		String s4="Amaravati";
		String s5=new String("Maharashtra");
		
		System.out.println(s4.toLowerCase());
		System.out.println(s5.toLowerCase());
		
		//4. use of equals () Method
		String V0="Velocity";
		String V1="Velocity";
		String V2=new String("Velocity");
		String V3=new String("velocity");
		
		System.out.println(V0==V1);
		System.out.println(V1==V2);
		System.out.println(V2==V3);
		System.out.println("=============================================");
		System.out.println(V0.equals(V1));
		System.out.println(V1.equals(V2));
		System.out.println(V2.equals(V3));
		System.out.println("=============================================");
		
		//5. use of equlas ignorecase
		System.out.println(V2.equalsIgnoreCase(V3));
		System.out.println("=============================================");
		
		//6. Contains () method Use
		String d="Velocity";
		System.out.println(d.contains("city"));
		System.out.println(d.contains("ciy"));
		System.out.println("=============================================");
		
		//7. is Empty() method Use
		String e0="pune";
		String e1=" ";
		//String e2=null;
		String e3="";
		
		System.out.println(e0.isEmpty());
		System.out.println(e1.isEmpty());
		//System.out.println(e2.isEmpty());
		System.out.println(e3.isEmpty());
		System.out.println("=============================================");
		
		//8. is Blank method use
		
		System.out.println(e0.isBlank());
		System.out.println(e3.isBlank());
		System.out.println("=============================================");
		
		//9. char at
		
		//w  ---> Thane (01234)
		
		String w="Thane";
		System.out.println(w.charAt(3));
		
		char ans = w.charAt(2);//store..create local variable ans ka
		System.out.println(ans);
		//System.out.println(w.charAt(9));......StringIndexOutOfBoundsException
		System.out.println("=============================================");
		
		//10. ends with
		
		String h = "abcd";
		System.out.println(h.endsWith("d"));
		System.out.println(h.endsWith("cd"));
		System.out.println(h.endsWith("bc"));
		System.out.println(h.endsWith("abcd"));
		System.out.println("=============================================");
		
		//11. Starts with use
		
		String y="India";
		System.out.println(y.startsWith("Ind"));
		System.out.println(y.startsWith("nd"));
		System.out.println(y.startsWith("indi"));
		System.out.println(y.startsWith("India"));
		System.out.println(y.startsWith("dia",2));
		System.out.println(y.startsWith("ia",3));
		System.out.println(y.startsWith("nd",2));
		System.out.println("=============================================");
		//12.Substring
		String m="maharashtra";
		System.out.println(m.substring(4));
		String str = m.substring(2);
		System.out.println(str);
		System.out.println("=============================================");
		//13.concat
		String a1="Gov of ";
		String a2="India";
		System.out.println(a1.concat(" "+a2));
		
		System.out.println(a1.concat("Maharashtra"));
		//14. Index of
		String t="Tea";
		int index=t.indexOf('e');
		System.out.println(index);
		String t1="India is my country";
		System.out.println(t1.indexOf('n'));
		System.out.println(t1.indexOf('i'));
		System.out.println(t1.lastIndexOf('i'));
		System.out.println(t1.indexOf('u',12));
		//15 Replace
		String m4="testing";
		System.out.println(m4.replace('t', 'T'));
		System.out.println(m4.replace("ing", " "));
		System.out.println(m4.replace("test", ""));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
