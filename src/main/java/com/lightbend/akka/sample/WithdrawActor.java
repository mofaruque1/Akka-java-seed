package com.lightbend.akka.sample;

import akka.actor.AbstractActor;

public class WithdrawActor extends AbstractActor {
	
	public static int balance = 5;

	@Override
	public Receive createReceive() {
		// TODO Auto-generated method stub
		return receiveBuilder()
				.matchEquals("withdraw", w ->{
					if(balance > 0) {						
						System.out.println(getContext().self());
						System.out.println("withdrawn 5 dollars from "+balance);
						balance = balance-5;
					}
					else {
						System.out.println("No money left");
					}
				})
				.build();
	}

}
