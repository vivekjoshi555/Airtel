package casting;

public class Son extends Father 
{
public void car()// overriding
{
	System.out.println("KIA Seltos");
}
public void bike()// overriding
{
	System.out.println("BMW");
}
public void degree()//new method of Son--> not supported for casting
{
	System.out.println("BE");
}
}
