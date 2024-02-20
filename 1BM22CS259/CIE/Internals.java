package CIE;
import java.util.*;
public class Internals extends Student{
	protected int marks[]=new int[5];
	public void inputcie()
	{
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++){
			marks[i]=s.nextInt();
		}
	}
}