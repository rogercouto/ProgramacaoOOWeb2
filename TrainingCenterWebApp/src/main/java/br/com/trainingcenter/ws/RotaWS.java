package br.com.trainingcenter.ws;

import br.com.trainingcenter.model.Lap;
import br.com.trainingcenter.model.Track;
import br.com.trainingcenter.model.res.LapDist;
import br.com.trainingcenter.model.res.LapDur;
import java.util.Date;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface RotaWS {

	@WebMethod(operationName="horaIni")
	@WebResult(name="hora")
	public String horaIni();
        
        @WebMethod(operationName="duracao")
	@WebResult(name="tempo")
	public String duracao();
        
        @WebMethod(operationName="distanciaTotal")
        @WebResult(name="distancia")
        public double distanciaTotal();
        
        @WebMethod(operationName="todasLaps")
        @WebResult(name="lap")
        public List<Lap> getLaps();
        
        @WebMethod(operationName="totalLaps")
        @WebResult(name="total")
        public int getTotalLaps();
	
        @WebMethod(operationName="distanciaPorLap")
        @WebResult(name="lap")
        public List<LapDist> getDistPLaps();
        
        @WebMethod(operationName="duracaoPorLap")
        @WebResult(name="lap")
        public List<LapDur> getDurPLaps();
        
        @WebMethod(operationName="tracksDaLap")
        @WebResult(name="track")
        public Track getTrack(@WebParam(name="StartTime")Date startTime);
}
