package com.iot.akka;

import java.io.IOException;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;

public class IotMain {
	public static void main(String[] args) throws IOException {

		ActorSystem actorSystem = ActorSystem.create("iot-ststem");
		try {
			ActorRef supervisorActor = actorSystem.actorOf(IotSupervisor.props(), "iot-supervisor");
			System.out.println("Press ENTER to exit the system");
			System.in.read();
		} finally {
			// TODO: handle finally clause
			actorSystem.terminate();
		}
	}

}
