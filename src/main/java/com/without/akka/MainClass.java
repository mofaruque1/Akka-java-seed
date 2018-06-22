package com.without.akka;

public class MainClass {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
		
	}
}
