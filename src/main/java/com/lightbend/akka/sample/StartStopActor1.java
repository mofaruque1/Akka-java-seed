package com.lightbend.akka.sample;

import akka.actor.AbstractActor;
import akka.actor.Props;

public class StartStopActor1 extends AbstractActor {

	@Override
	public void preStart() {
		System.out.println("first started");
		getContext().actorOf(Props.create(StartStopActor2.class),"second");

	}

	@Override
	public void postStop() {
		System.out.println("first stopped");
	}

	
	@Override
	public Receive createReceive() {
		// TODO Auto-generated method stub
		return receiveBuilder()
				.matchEquals("stop", s -> {
					getContext().stop(getSelf());
				})
				.build();
	}

}
