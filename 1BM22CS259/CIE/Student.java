package CIE;
import java.util.*;
public class Student{
	protected String name=new String();
	protected String usn=new String();
	protected int sem;
	public void inputstuddetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Student name:");
		name=s.nextLine();
		System.out.println("Student usn:");
		usn=s.nextLine();
		System.out.println("Student sem:");
		sem=s.nextInt();
	}
	public void display()
	{
		System.out.println("Student details");
		System.out.println("NAME:"+name);
		System.out.println("USN:"+usn);
		System.out.println("sem:"+sem);
	}
}
