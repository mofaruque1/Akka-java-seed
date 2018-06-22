package com.lightbend.akka.sample;

import akka.actor.AbstractActor;
import akka.actor.Props;

public class MyActor extends AbstractActor {

	// Props is a configuration object used for creating an Actor
	public static Props props() {
		return Props.create(MyActor.class);
	}

	@Override
	public void preStart() {
		//log.info("IoT Application started");
		System.out.println("Application started");
	}

	@Override
	public void postStop() {
		//log.info("IoT Application stopped");
		System.out.println("Application stopped");
	}

	@Override
	public Receive createReceive() {
		// TODO Auto-generated method stub
		return receiveBuilder().match(String.class, s -> {
			System.out.println("Received String message: "+ s);
		}).matchAny(o -> {
			System.out.println("Received unknown message");
		}).build();
	}

}
