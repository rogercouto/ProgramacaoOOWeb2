package br.com.trainingcenter.ws;

import br.com.trainingcenter.model.Activity;
import br.com.trainingcenter.model.Lap;
import br.com.trainingcenter.model.Track;
import br.com.trainingcenter.model.TrainingCenterDatabase;
import br.com.trainingcenter.model.dao.TrainingCenterDAO;
import br.com.trainingcenter.model.res.LapDist;
import br.com.trainingcenter.model.res.LapDur;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/rota")
public class Rota {
 
    private final TrainingCenterDAO DAO = new TrainingCenterDAO("C:\\rota1.tcx");
    private final TrainingCenterDatabase DB = DAO.unmarshall();
        
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String digaOla(){
        return "Ola mundo!";
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/lista")
    public TrainingCenterDatabase listaDados(){
        return DB;
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/horaIni")
    public String horaIni(){
        Date date = DB.getActivities().getList().get(0).getId();
        DateFormat df = new SimpleDateFormat("HH:mm");
        return df.format(date);
    }
        
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/duracao")
    public String duracao(){
        double totalSeconds = 0;
        for(Activity activity : DB.getActivities().getList()){
            for(Lap lap : activity.getLaps()){
                totalSeconds += lap.getTotalTimeSeconds();
            }
        }
        return LocalTime.MIN.plusSeconds((int)totalSeconds).toString();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/distanciaTotal")
    public double distanciaTotal(){
        double distancia = 0;
        for(Activity activity : DB.getActivities().getList()){
            for(Lap lap : activity.getLaps()){
                distancia += lap.getDistanceMeters();
            }
        }
        return distancia;
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/laps")
    public List<Lap> getLaps(){
        List<Lap> laps = new ArrayList<>();
        for(Activity activity : DB.getActivities().getList()){
            laps.addAll(activity.getLaps());
        }
        return laps;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/totalLaps")
    public int getTotalLaps(){
        int count = 0;
        for(Activity activity : DB.getActivities().getList()){
            count += activity.getLaps().size();
        }
        return count;
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/distanciaPorLap")
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

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/duracaoPorLap")
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

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/tracksDaLap")
    public Track getTrack(@QueryParam("StartTime")String startTime){
        Lap lap = null;
        List<Lap> laps = getLaps();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (Lap l : laps) {
            if (df.format(l.getStartTime()).compareTo(startTime) == 0){
                lap = l;
                break;
            }
        }
        if (lap != null)
            return lap.getTrack();
        return null;
    }
    
}
