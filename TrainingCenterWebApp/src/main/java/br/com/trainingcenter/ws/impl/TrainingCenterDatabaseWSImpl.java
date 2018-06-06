package br.com.trainingcenter.ws.impl;

import br.com.trainingcenter.model.TrainingCenterDatabase;
import br.com.trainingcenter.model.dao.TrainingCenterDAO;
import javax.jws.WebService;

@WebService(endpointInterface="br.com.trainingcenter.ws.TrainingCenterDatabaseWS", serviceName="TrainingCenterDatabaseWS")
public class TrainingCenterDatabaseWSImpl {
    
        TrainingCenterDAO dao = new TrainingCenterDAO("/home/roger/GIT/ProgramacaoOOWeb2/TrainingCenterWebApp/rota2.tcx");

	public TrainingCenterDatabase getTrainingCenterDatabase(){
            return dao.unmarshall();
        }
	
}