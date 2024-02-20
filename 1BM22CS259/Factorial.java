import java.util.*;
class Factorial{
public static void main(String args[])
{
int fac=1;
System.out.println("Enter a number:");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int i=1; i<=n; i++){
fac=fac*i;
}
System.out.println("The factorial: "+fac);
}
}