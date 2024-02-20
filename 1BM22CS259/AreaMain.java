import java.util.*;
class Inputscanner{
Scanner s;
	Inputscanner()
	{
		s=new Scanner(System.in);
	}
}

abstract class Shape extends Inputscanner{
	double a;
	double b;
	abstract void getinput();
	abstract void displayarea();
}

class Rectangle extends Shape
{	
	void getinput()
	{	
		Inputscanner sc=new Inputscanner();
		System.out.println("Enter the dimensions of the rectangle");
		a=sc.s.nextDouble();
		b=sc.s.nextDouble();
	}
	void displayarea()
	{
		System.out.println("area of rectangle is :" + (a*b));
	}
}

class Triangle extends Shape
{
	void getinput()
	{	
		Inputscanner sc=new Inputscanner();
		System.out.println("Enter the dimensions of the triangle");
		a=sc.s.nextDouble();
		b=sc.s.nextDouble();
	}
	void displayarea()
	{
		System.out.println("area of triangle is :" + (0.5*(a*b)));
	}
}

class Circle extends Shape
{
	void getinput()
	{	
		Inputscanner sc=new Inputscanner();
		System.out.println("Enter the radius of circle");
		a=sc.s.nextDouble();
	}
	void displayarea()
	{	
		double pi=3.14;
		System.out.println("area of Circle is :" + (pi*a*a));
	}
}

public class AreaMain
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		r.getinput();
		r.displayarea();

		Triangle t=new Triangle();
		t.getinput();
		t.displayarea();
		
		Circle c=new Circle();
		c.getinput();
		c.displayarea();
		System.out.println("NAME: SHIVARAJ K PUJARI");
		System.out.println("USN: 1BM22CS259");
	}
}