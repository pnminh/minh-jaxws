package com.minh.jaxws.test;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.junit.Test;

import minh.beerexpert.service.generated.BeerExpertServicePortType;
import minh.beerexpert.service.generated.BeerExpertServiceRequestType;
import minh.beerexpert.service.generated.BeerExpertServiceResponseType;

public class BeerExpertTestClient {
	public static final String WSDL_URL = "http://localhost:8080/beerExpertService?wsdl";
	public static final String SERVICE_URI = "http://impl.jaxws.minh.com/";
	public static final String SERVICE_NAME = "BeerExpertServiceImplService";

	BeerExpertServicePortType port = null;

	public BeerExpertTestClient(){
	    URL url = null;
	    try {
	      url = new URL(WSDL_URL);
	    } catch (MalformedURLException e) {
	      throw new RuntimeException(e); // rethrow as rte
	    }
	    QName qname = new QName(SERVICE_URI, SERVICE_NAME);
	    Service service = Service.create(url, qname);
	    port = service.getPort(BeerExpertServicePortType.class);
	  }

	public String getBrands(String color) {
		BeerExpertServiceRequestType request = new BeerExpertServiceRequestType();
		request.setColor(color);
		BeerExpertServiceResponseType response = port.getBeerAdvice(request);
		return response.getAdvice();
	}
	@Test
	public void testBeerExpert(){
		System.out.println(new BeerExpertTestClient().getBrands("Green"));
	}
}
