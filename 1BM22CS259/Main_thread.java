import java.util.*;
class Hello extends Thread {

public void run() {

for(int i=1;i<=10;i++) {

System.out.println("Hello");

}

}

}
class Hi extends Thread{

public void run() {

for(int i=1;i<=10;i++) {

System.out.println("Hi");

}

}

}
public class Main_thread {

public static void main(String[] args) {

Hello t1 = new Hello();
t1.start();
Hi t2 = new Hi();
//try{
	
	//t1.sleep(50);
	t2.start();
//}
//catch(InterruptedException exc){
//System.out.println("error");
//}
}

}