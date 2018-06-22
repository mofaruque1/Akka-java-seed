package com.without.akka;

public class C extends Thread{

	public void run() {
		System.out.println("Thread C started : ");
		Utility.withdraw();
	}
}
