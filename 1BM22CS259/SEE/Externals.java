package SEE;
import CIE.Internals;
import java.util.*;
public class Externals extends Internals
{
	protected int marks[];
	protected int finalmarks[];
	public Externals()
	{
		marks=new int[5];
		finalmarks=new int[5];
	}
	public void inputsee()
	{
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.println("Subject" + (i+1)+ "marks:");
			marks[i]=s.nextInt();
		}
	}
	public void cfmarks()
	{
		for(int i=0;i<5;i++)
			finalmarks[i]=marks[i]/2+super.marks[i];
	}
	public void displayfmarks()
	{	
		display();
		for(int i=0;i<5;i++)
			System.out.println("Subject" + (i+1) +":" + finalmarks[i]);
	}
}