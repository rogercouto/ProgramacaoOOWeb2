package br.com.trainingcenter.ws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface OlaMundoWS {

	@WebMethod(operationName="olaMundo")
	@WebResult(name="mensagem")
	public String olaMundo();
	
}
