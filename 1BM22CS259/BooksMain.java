import java.util.*;

class Book{
String name;
String author;
int price;
int numpages;

Book(String name,String author,int price,int numpages)
{
	this.name=name;
	this.author=author;
	this.price=price;
	this.numpages=numpages;
}

 String getname()
{
	return name;
}
 String getauthor()
{
	return author;
}
 int getprice()
{
	return price;
}
int getnumpages()
{
	return numpages;
}

void setname(String name)
{
	this.name=name;
}
void setauthor(String author)
{
	this.author=author;
}
void setprice(int price)
{
	this.price=price;
}
void setnumpages(int numpages)
{
	 this.numpages=numpages;
}

public String toString()
{
	String name,author;
	String price,numpages;
	name="Book name:" + this.name + "\n";
	author="Author name:"+ this.author + "\n";
	price="Price:"+ this.price + "\n";
	numpages="Number of pages:" + this.numpages+ "\n";
	return name+author+price+numpages;
}
};

public class BooksMain{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,price,numpages;
		String name, author;
		System.out.println("Enter n");
		n=s.nextInt();
		Book b[];
		b=new Book[n];
		System.out.println("By toString method");
		for(int i=0;i<n;i++)
		{	
			System.out.println("Enter the book name");
			name=s.next();
			System.out.println("Enter the author name");
			author=s.next();
			System.out.println("Enter the price of book");
			price=s.nextInt();
			System.out.println("Enter the number of pages");
			numpages=s.nextInt();
			b[i]=new Book(name,author,price,numpages);
		}
		for(int i=0;i<n;i++)
		{
			String Bookdetails=b[i].toString();
			System.out.println(Bookdetails);
		}
		System.out.println("**********************************");
		System.out.println("By get and set methods");
		for(int i=0;i<n;i++)
		{	
			
			System.out.println("enter book name:");
			name=s.next();
			b[i].setname(name);

			System.out.println("enter author name:");
			author=s.next();
			b[i].setauthor(author);

			System.out.println("enter book price:");
			price=s.nextInt();
			b[i].setprice(price);
			
			System.out.println("enter number of pages:");
			numpages=s.nextInt();
			b[i].setnumpages(numpages);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Book name:"+b[i].getname());
			System.out.println("Author name:"+b[i].getauthor());
			System.out.println("Book price:"+b[i].getprice());
			System.out.println("Number of pages:"+b[i].getnumpages());
		}
		System.out.println("NAME:Shivaraj K Pujari");
		System.out.println("USN:1BM22CS259");
	}
}
		
	

