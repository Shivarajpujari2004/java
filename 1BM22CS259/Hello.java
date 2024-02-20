import java.util.Scanner;
class Hello{
public static void main(String args[])
{
int a;
float b;
String s;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string");
s=sc.nextLine();
System.out.println("Your entered string "+s);
System.out.println("Enter an integer");
a=sc.nextInt();
System.out.println("Your entered integer "+a);
System.out.println("Enter a float");
b = sc.nextFloat();
System.out.println("Your entered float "+b);
}
}