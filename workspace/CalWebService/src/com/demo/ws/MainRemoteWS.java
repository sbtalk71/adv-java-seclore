package com.demo.ws;

import javax.xml.ws.Endpoint;

public class MainRemoteWS {

	public static void main(String[] args) {
	
		System.out.println("calculator Ws is started....");
		Endpoint.publish("http://localhost:8181/ws/cal", new Calculator());

	}

}
