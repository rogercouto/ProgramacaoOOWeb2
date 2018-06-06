package br.com.trainingcenter.ws;

import br.com.trainingcenter.model.TrainingCenterDatabase;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface TrainingCenterDatabaseWS {

	@WebMethod(operationName="getDatabase")
	@WebResult(name="trainingCenterDatabase")
	public TrainingCenterDatabase getTrainingCenterDatabase();
	
}
