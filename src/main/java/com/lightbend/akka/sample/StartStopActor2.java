package com.lightbend.akka.sample;

import akka.actor.AbstractActor;

public class StartStopActor2 extends AbstractActor {

	@Override
	public void preStart() {
		System.out.println("second started");
	}

	@Override
	public void postStop() {
		System.out.println("second stopped");
	}

	@Override
	public Receive createReceive() {
		// TODO Auto-generated method stub
		return receiveBuilder().build();

	}

}
