package com.minh.jaxws.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import minh.beerexpert.service.generated.BeerExpertServicePortType;
import minh.beerexpert.service.generated.BeerExpertServiceRequestType;
import minh.beerexpert.service.generated.BeerExpertServiceResponseType;
@WebService(endpointInterface="minh.beerexpert.service.generated.BeerExpertServicePortType")
public class BeerExpertServiceImpl implements BeerExpertServicePortType {
	@WebMethod(operationName = "getBeerAdvice", action = "http://www.minh.jaxws/BeerAdviseService/getBeerAdvise")
	@WebResult(name = "BeerExpertServiceResponse", targetNamespace = "http://www.minh.jaxws/beerExpert/", partName = "BeerExpertServiceResponse")
	public BeerExpertServiceResponseType getBeerAdvice(
			@WebParam(name = "BeerExpertServiceRequest", targetNamespace = "http://www.minh.jaxws/beerExpert/", partName = "BeerExpertServiceRequest") BeerExpertServiceRequestType beerExpertServiceRequest) {
		String color = beerExpertServiceRequest.getColor();
	    
	 
	    BeerExpertServiceResponseType response = new BeerExpertServiceResponseType();
	 
	    response.setAdvice("Your beer color:" + color);
	 
	    return response;
	}

}