import java.util.Scanner;
class Quadratic
{
int a, b, c;
double r1, r2, d;
void getd()
{
Scanner s = new Scanner(System.in);
System.out.println(&quot;Enter the coefficients of a,b,c&quot;);
a = s.nextInt();
b = s.nextInt();
c = s.nextInt();
}
void compute()
{
while(a==0)
{
System.out.println(&quot;Not a quadratic equation&quot;);
System.out.println(&quot;Enter a non zero value for a:&quot;);
Scanner s = new Scanner(System.in);
a = s.nextInt();
}
d = b*b-4*a*c;
if(d==0)
{

r1 = (-b)/(2*a);
System.out.println(&quot;Roots are real and equal&quot;);
System.out.println(&quot;Roo1 = Root2 = &quot; + r1);
}
else if(d&gt;0)
{
r1 = ((-b)+(Math.sqrt(d)))/(double)(2*a);
r2 = ((-b)-(Math.sqrt(d)))/(double)(2*a);
System.out.println(&quot;Roots are real and distinct&quot;);
System.out.println(&quot;Roo1 = &quot; + r1 + &quot; Root2 = &quot; + r2);
}
else if(d&lt;0)
{
System.out.println(&quot;Roots are imaginary&quot;);
r1 = (-b)/(2*a);
r2 = Math.sqrt(-d)/(2*a);
System.out.println(&quot;Root1 = &quot; + r1 + &quot; + i&quot;+r2);
System.out.println(&quot;Root1 = &quot; + r1 + &quot; - i&quot;+r2);
}

}
}

class QuadraticMain
{
public static void main(String args[])
{
Quadratic q = new Quadratic();
q.getd();

q.compute();
}
}