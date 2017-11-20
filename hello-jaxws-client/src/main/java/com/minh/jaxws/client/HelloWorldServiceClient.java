package com.minh.jaxws.client;

import com.minh.jaxws.service.generated.HelloWorld;
import com.minh.jaxws.service.generated.HelloWorldImplService;

public class HelloWorldServiceClient {
	public static void main(String...args){
		HelloWorldImplService helloService =  new HelloWorldImplService();
		HelloWorld helloWorldPort = helloService.getHelloWorldImplPort();
		System.out.println(helloWorldPort.sayHelloTo("Minh"));
	}
}
