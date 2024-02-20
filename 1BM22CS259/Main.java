import java.util.*;
class Subject{
	int submarks;
	int credits;
	int grade;
}

class Student{
	Subject subject[];
	String name;
	String USN;
	double SGPA;
	Scanner s;

	Student()
	{
	int i;
	subject=new Subject[9];
	for(i=0;i<9;i++)
		subject[i]=new Subject();
	s=new Scanner(System.in);
	}

	void getstudentdetails()
	{
	System.out.println("enter name and usn");
	this.name=s.nextLine();
	this.USN=s.nextLine();
	}
	
	void getmarks()
	{
	int i;
	for(i=0;i<8;i++)
	{
		System.out.println("Enter the marks of " + (i+1)+ " Subject");
		subject[i].submarks=s.nextInt();
		System.out.println("Enter the credits of " + (i+1)+ " Subject");
		subject[i].credits=s.nextInt();
		subject[i].grade=(subject[i].submarks/10)+1;
		if(subject[i].grade>10){
			subject[i].grade=10;
		}
		if(subject[i].grade<4){
			subject[i].grade=0;
		}
	}
	}

	void computeSGPA()
	{
		int totalcredits=0;
		int sum=0;
		int i;
		for( i=0;i<8;i++)
		{
			sum=sum+subject[i].grade * subject[i].credits;
			totalcredits=totalcredits+subject[i].credits;	
		}
		this.SGPA=(double) sum/totalcredits;
		
	}	
}

public class Main
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.getstudentdetails();
		s1.getmarks();
		s1.computeSGPA();
		System.out.println("NAME:"+s1.name);
		System.out.println("USN:"+s1.USN);
		System.out.println("SGPA:"+s1.SGPA);
	}
}
