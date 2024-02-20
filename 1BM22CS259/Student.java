import java.util.scanner
public class Student{
string usn;
string name;
int i=0;
private static int[] credit={4,4,3,3,3,1,1,1};
scanner in = new scanner(system.in);

public void first(){
system.out.print("Enter your usn: ");
usn=in.next();
system.out.print("Enter your name: ");
name=in.next();
}

public double res(int[] arr){
double marks=0 , sgpa=0;
int i;
for(i=0;i<arr.length;i++){
i+(arr[i]>=100{
arr[i]=arr[i]-10;
}
marks+=(credit[i] * (int) arr[i]/10+1));
}
sgpa=marks/20;
return sgpa;
}

public void display(double result){
System.out.println("sgpa:"+result);
}
}