class Myex extends Exception{
	public Myex(String s)
	{
		super(s);
	}
}
public class Mymain{
	public static void main(String args[])
	{
		int i=20;
		int j=0;
		try{
			j=18/i;
			if(j==0)
				throw new Myex("My excesjidfjif");
		}
		catch(Myex e)
		{
			System.out.println("Divide by big nor "+e);
			System.out.println(e.getMessage());
		}
	}

}