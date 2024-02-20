import java.util.*;
class palindrome{
public static void main(String args[])
{
int n, t, rem, rev=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a 5 digit number: ");
n = sc.nextInt();
t = n;
while(t>0){
rem = t%10;
rev = rev*10+rem;
t = t/10;
}
if(rev == n) {
System.out.println("Palindrome");
}
else {
System.out.println("not palindrome");
}}}