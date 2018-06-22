package com.omor.akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class MainClass {

	public static void main(String[] args) {

		final ActorSystem system = ActorSystem.create("helloakka");
		try {
			ActorRef supervisingActor = system.actorOf(Props.create(SupervisingActor.class), "supervising-actor");
		    supervisingActor.tell("failChild", ActorRef.noSender());
		} finally {
			system.terminate();
		}
	    
	}
}
