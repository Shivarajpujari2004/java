import SEE.Externals;
class StudentMain{
	public static void main(String args[])
	{
		int n=2;
		Externals finalMarks[]=new Externals[n];
		for(int i=0;i<n;i++)
		{
			finalMarks[i]=new Externals();
			finalMarks[i].inputstuddetails();
			System.out.println("Enter CIE marks");
			finalMarks[i].inputcie();
			System.out.println("Enter SEE marks");
			finalMarks[i].inputsee();
		}
		System.out.println("Displaying Data:\n");
		for(int i=0;i<n;i++)
		{
			finalMarks[i].cfmarks();
			finalMarks[i].displayfmarks();
		}
	}
}