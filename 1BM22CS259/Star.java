import java.util.*;
class D <T>{
T a;
//D(T b){
//a=b;
//}
public void design(){
for(T i=1;i<a;i++)
{
for(T  j=0;j<i;j++)
{
System.out.print("* ");
}
System.out.println("");
}
}
}
public class Star
{
public static void main(String args[])
{
D <Integer> d=new D<Integer>();
d.a=5;
d.design();
}
}