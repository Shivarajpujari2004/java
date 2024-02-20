abstract class figure
{
	double a;
	double b;
	figure(double x,double y)
	{
		a=x;	
		b=y;
	}
	abstract double area();
}

class rectangle extends figure{
	rectangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("inside Area of rectangle ");
		return a*b;
	}
}
class triangle extends figure{
	triangle(double a,double b)
	{
		super(a,b);
	}
	double area()
	{
		System.out.println("inside Area of triangle ");
		return a*b*0.5;
	}	
}
class Abstract{
	public static void main(String args[])
	{
		rectangle r=new rectangle(9,5);
		triangle t=new triangle(4,5);
		figure fig;
		fig=r;
		System.out.println("Area is " + fig.area());
		fig=t;
		System.out.println("Area is " + fig.area());
}}