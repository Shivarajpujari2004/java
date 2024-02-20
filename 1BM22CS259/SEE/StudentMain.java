import SEE.Externals;
class StudentMain{
	public static void main(String args[])
	{
		int n=2;
		Externals finalMarks[]=new Externals[n];
		for(int i=0;i<n;i++)
		{
			finalMarks[i]=new Externals();
			System.out.println("Displaying Data:\n")
			for(int i=0;i<n;i++)
			{
				finalMarks[i].cfmarks();
				finalMarks[i].displayfmarks();
			}
		}
	}
}