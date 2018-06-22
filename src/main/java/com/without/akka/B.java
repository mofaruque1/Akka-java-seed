package com.without.akka;

public class B extends Thread {
	public void run() {
		System.out.println("Thread B started : ");
		Utility.withdraw();
	}
}
