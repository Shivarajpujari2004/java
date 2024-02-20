import java.util.Scanner;
class Quadratic{
int a,b,c;
double r1,r2,d;
void getd()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the co-efficients of a,b and c");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
}
void compute()
{
while(a==0)
{
System.out.println("Not a Quadratic Equation");
System.out.println("Enter a non zero value for a:");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
}
d=b*b-4*a*c;
if(d==0)
{
r1=(-b)/(2*a);
System.out.println("roots are real and equal");
System.out.println("root1=root2="+r1);
}
else if(d>0)
{
r1=((-b)+(Math.sqrt(d)))/(double)(2*a);
r2=((-b)-(Math.sqrt(d)))/(double)(2*a);
System.out.println("roots are real and distinct");
System.out.println("Root1="+r1+"Root2="+r2);
}
else if(d<0)
{
System.out.println("Roots are imaginary");
r1 = (-b)/(2*a);
r2 = Math.sqrt(-d)/(2*a);
System.out.println("Root1 = " + r1 + "+i"+r2);
System.out.println("Root1 = " + r1 + "-i"+r2);
}
}
}
public class quadraticmain
{
public static void main(String args[])
{
Quadratic q=new Quadratic();
q.getd();
q.compute();
System.out.println("Name:Shivaraj K Pujari");
System.out.println("USN:1BM22CS259");
}
}