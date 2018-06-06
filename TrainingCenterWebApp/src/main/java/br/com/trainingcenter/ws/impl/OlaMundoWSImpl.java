package br.com.trainingcenter.ws.impl;

import javax.jws.WebService;

@WebService(endpointInterface="br.com.trainingcenter.ws.OlaMundoWS", serviceName="OlaMundoWS")
public class OlaMundoWSImpl {

	public String olaMundo(){
		return  "Olá mundo!";
	}
	
}