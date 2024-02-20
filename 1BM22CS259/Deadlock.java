class A {

synchronized void foo(B b) {

String name =Thread.currentThread().getName();

System.out.println(name + " entered A.foo");

try {

Thread.sleep(1000);

} catch(Exception e) {

System.out.println("A Interrupted");

}

System.out.println(name + " trying tocall B.last()");

b.last();

}

void last() {

System.out.println("Inside A.last");

}

}

class B {

synchronized void bar(A a) {

String name =Thread.currentThread().getName();

System.out.println(name + " enteredB.bar");

try {

Thread.sleep(1000);

} catch(Exception e) {

System.out.println("B Interrupted");

}

System.out.println(name + " trying tocall A.last()");

a.last();

}

void last() {

System.out.println("Inside A.last");

}

}

class Deadlock implements Runnable
{

A a = new A();

B b = new B();

Deadlock() {

Thread.currentThread().setName("MainThread");

Thread t = new Thread(this,"RacingThread");

t.start();

a.foo(b); // get lock on a in thisthread.

System.out.println("Back in mainthread");

}

public void run() {

b.bar(a); // get lock on b in otherthread.

System.out.println("Back in otherthread");

}

public static void main(String args[]) {

new Deadlock();

}

}
