package protectedpackage;
import accessSpecifiers.Privateuse;
public class Sample extends Privateuse {

	public static void main(String[] args) 
	{
		 Privateuse p=new  Privateuse ();// 
         p.test1();//we can call only public methods in another package
         
       //to call protected methods we need to create object of subclass//by using inherritance

         Sample s=new Sample();//creating object of subclass
         s.test1();// calling superclass public method using subclass object
         s.test4();// calling superclass protected method using subclass object
	}

}   