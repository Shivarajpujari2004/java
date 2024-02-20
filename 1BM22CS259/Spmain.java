import java.util.*;
class Wrongage extends Exception{
	public Wrongage(String s)
	{
		super(s);
	}
}
class Father{
	int fage;
	Father () throws Wrongage
	{	
		System.out.println("enter father's age");
		Scanner s=new Scanner(System.in);
		fage=s.nextInt();
		if(fage<0)
		{
			throw new Wrongage("Age cannnot be negative");
		}
	}
	void display()
	{
		System.out.println("Father's Age is :" + fage);
	}
}
class Son extends Father{
	int sage;
	Son () throws Wrongage
	{	
		System.out.println("enter son's age");
		Scanner s=new Scanner(System.in);
		sage=s.nextInt();
		if(sage>fage)
		{
			throw new Wrongage("Son's age cannot be greater than father's age");
		}
		else if(sage==fage){
			throw new Wrongage("Age cannnot be same");
		}
		else if(sage<0)
		{
			throw new Wrongage("Age cannnot be negative");
		}
	}
	void sdisplay()
	{
		System.out.println("Son's Age is :" + sage);
	}
}
class Spmain{
	public static void main(String args[])
	{
		try{
			Son s=new Son();
			s.display();
			s.sdisplay();
		}
		catch(Wrongage e){
			System.out.println(e);
		}
		System.out.println("NAME: Shivaraj K Pujari");
		System.out.println("USN:1BM22CS259");		
	}
}