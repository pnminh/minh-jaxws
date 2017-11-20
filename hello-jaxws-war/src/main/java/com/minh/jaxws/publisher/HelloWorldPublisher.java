package com.minh.jaxws.publisher;

import javax.xml.ws.Endpoint;

import com.minh.jaxws.service.HelloWorldImpl;
public class HelloWorldPublisher {
	public static void main(String[] args) {
		   Endpoint.publish("http://localhost:8080/ws/hello", new HelloWorldImpl());
	    }
}
