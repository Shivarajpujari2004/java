class CS extends Thread
{
public void run()
{
for(int i=1; i<=20; i++){
	try{
		
		System.out.println("BMS College of Engineering" + i);
		Thread.sleep(10000);
	}
	catch(InterruptedException e){
		System.out.println("thread error");
	}
}
}
}

class IS extends Thread
{
public void run()
{
for(int i=1; i<=20; i++){
	try{
		
		System.out.println("Computer Science " + i);
		Thread.sleep(2000);
	}
	catch(InterruptedException e){
		System.out.println("thread error");
	}
}
}
}

public class Tmain {
public static void main(String args[])
{
CS c1 = new CS();
c1.start();

IS i1 = new IS();
i1.start();
}
}