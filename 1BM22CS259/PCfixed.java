import java.util.*;
class Q{
int n;
boolean valueset=false;
synchronized int get(){
	while(!valueset)
		try{
		System.out.println("Consumer waiting\n");
		wait();
}
catch(InterruptedException e){
	System.out.println("Interrupted Exception caught\n");
}
System.out.println("Got:"+n);
valueset=false;
System.out.println("Intimate Producer\n");
notify();
return n;
}

synchronized void put(int n)
{
	while(valueset)
		try{
		System.out.println("Producer waiting\n");
		wait();
}
catch(InterruptedException e){
System.out.println("Interrupted Exception caught\n");
}
this.n=n;
valueset=true;
System.out.println("Put:"+n);
System.out.println("Intimate Consumer\n");
notify();
}
}

class Producer implements Runnable{
Q q;
Producer (Q q){
this.q=q;
new Thread(this,"Producer").start();
}
public void run(){
int i=0;
while(i<5){
q.put(i++);
}}}

class Consumer implements Runnable{
Q q;
Consumer (Q q){
this.q=q;
new Thread (this,"Consumer").start();
}
public void run(){
	int i=0;
while(i<5){
int r=q.get();
System.out.println("Consumed:"+r);
i++;
}}}

class PCfixed{
public static void main(String args[]){
Q q=new Q();
new Producer(q);
new Consumer(q);
System.out.println("Press Ctrl-C to stop");
}}
