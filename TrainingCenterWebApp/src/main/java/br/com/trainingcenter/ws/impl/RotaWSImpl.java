package br.com.trainingcenter.ws.impl;

import br.com.trainingcenter.model.Activity;
import br.com.trainingcenter.model.Lap;
import br.com.trainingcenter.model.Track;
import br.com.trainingcenter.model.TrainingCenterDatabase;
import br.com.trainingcenter.model.dao.TrainingCenterDAO;
import br.com.trainingcenter.model.res.LapDist;
import br.com.trainingcenter.model.res.LapDur;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface="br.com.trainingcenter.ws.RotaWS", serviceName="RotaWS")
public class RotaWSImpl {

        private final TrainingCenterDAO DAO = new TrainingCenterDAO("/home/roger/GIT/ProgramacaoOOWeb2/TrainingCenterWebApp/rota2.tcx");
        private final TrainingCenterDatabase DB = DAO.unmarshall();
        
	public String horaIni(){
            Date date = DB.getActivities().getList().get(0).getId();
            DateFormat df = new SimpleDateFormat("HH:mm");
            return df.format(date);
	}
        
        public String duracao(){
            double totalSeconds = 0;
            for(Activity activity : DB.getActivities().getList()){
                for(Lap lap : activity.getLaps()){
                    totalSeconds += lap.getTotalTimeSeconds();
                }
            }
            return LocalTime.MIN.plusSeconds((int)totalSeconds).toString();
	}
        
        public double distanciaTotal(){
            double distancia = 0;
            for(Activity activity : DB.getActivities().getList()){
                for(Lap lap : activity.getLaps()){
                    distancia += lap.getDistanceMeters();
                }
            }
            return distancia;
        }
	
        public List<Lap> getLaps(){
            List<Lap> laps = new ArrayList<>();
            for(Activity activity : DB.getActivities().getList()){
                laps.addAll(activity.getLaps());
            }
            return laps;
        }
        
        public int getTotalLaps(){
            int count = 0;
            for(Activity activity : DB.getActivities().getList()){
                count += activity.getLaps().size();
            }
            return count;
        }
        
        public List<LapDist> getDistPLaps(){
            List<Lap> laps = getLaps();
            List<LapDist> res = new ArrayList<>();
            for (Lap lap : laps) {
                LapDist l = new LapDist();
                l.setNumber(laps.indexOf(lap)+1);
                l.setDistanceMeters(lap.getDistanceMeters());
                res.add(l);
            }
            return res;
        }
        
        public List<LapDur> getDurPLaps(){
            List<Lap> laps = getLaps();
            List<LapDur> res = new ArrayList<>();
            for (Lap lap : laps) {
                LapDur l = new LapDur();
                l.setNumber(laps.indexOf(lap)+1);
                l.setTotalTimeSeconds(lap.getTotalTimeSeconds());
                res.add(l);
            }
            return res;
        }
        
        public Track getTrack(@WebParam(name="StartTime")Date startTime){
            Lap lap = null;
            List<Lap> laps = getLaps();
            for (Lap l : laps) {
                if (l.getStartTime().compareTo(startTime) == 0){
                    lap = l;
                    break;
                }
            }
            if (lap != null)
                return lap.getTrack();
            return null;
        }
                
}