package com.omor.akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class MainClass {

	public static void main(String[] args) {

		final ActorSystem system = ActorSystem.create("helloakka");
		try {
			ActorRef supervisingActor = system.actorOf(Props.create(SupervisingActor.class), "supervising-actor");

			new Thread(() -> {
				System.out.println("1 started");
				supervisingActor.tell("withdrawFromAcct", ActorRef.noSender());
			}).start();
			
			new Thread(() -> {
				System.out.println("2 started");
				supervisingActor.tell("withdrawFromAcct", ActorRef.noSender());
			}).start();
			
			new Thread(() -> {
				System.out.println("3 started");
				supervisingActor.tell("withdrawFromAcct", ActorRef.noSender());			
			}).start();
			
		} finally {
			system.terminate();
		}

	}
}
