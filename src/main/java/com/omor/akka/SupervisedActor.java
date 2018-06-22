package com.omor.akka;

import akka.actor.AbstractActor;

public class SupervisedActor extends AbstractActor {

	public static int balance = 10;
	@Override
	public void preStart() {
		System.out.println("supervised actor started");
	}

	@Override
	public void postStop() {
		System.out.println("supervised actor stopped");
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder().matchEquals("withdraw", w -> {
			//System.out.println("supervised actor doing some work");
			if(balance>0) {
				int withdrawAmt = 5;
				System.out.println("\tfrom "+balance +"$ , withdrawing "+withdrawAmt+"$");
				balance = balance - withdrawAmt;
				
			}
			else {
				System.out.println("\tNo money left");
			}
			//System.out.println("supervised actor doing some work");
			//throw new Exception("I failed!");
		}).build();
	}

}
