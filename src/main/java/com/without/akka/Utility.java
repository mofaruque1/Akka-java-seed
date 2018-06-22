package com.without.akka;

public class Utility {
	public static int balance = 10;
	public static void withdraw() {
		if(balance>0) {
			int withdrawAmt = 5;
			System.out.println("\tfrom "+balance +"$ , withdrawing "+withdrawAmt+"$");
			balance = balance - withdrawAmt;
			
		}
		else {
			System.out.println("\tNo money left");
		}
	}
}
