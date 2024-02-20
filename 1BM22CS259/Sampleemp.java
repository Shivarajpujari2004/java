import java.util.*;
class exp extends Exception{
	public exp(String s)
	{
	super(s);
	}
}
class Sampleemp{
	void empcheck(int a) throws exp
	{	
		int empid=a;
		if(empid<=0 || empid>=999)
		{
			throw new exp("Wrong msg");	
		}
		else
		{
			System.out.println("Valid");	
		}
	}
	public static void main(String args[]){	
		Sampleemp emp=new Sampleemp();
		try
		{
			emp.empcheck(1000);
		} 
		catch (exp e)
		{
			System.out.println("Exp caught"+e);
			System.out.println(e.getMessage());		
		}
	
	}

}