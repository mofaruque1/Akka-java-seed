package com.without.akka;

public class A extends Thread  {
	public void run() {
		System.out.println("Thread A started : ");
		Utility.withdraw();
}

}
