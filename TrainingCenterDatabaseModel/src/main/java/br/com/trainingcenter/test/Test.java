/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trainingcenter.test;

import br.com.trainingcenter.model.Activities;
import br.com.trainingcenter.model.Activity;
import br.com.trainingcenter.model.Lap;
import br.com.trainingcenter.model.Track;
import br.com.trainingcenter.model.TrackPoint;
import br.com.trainingcenter.model.TrainingCenterDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.sax.SAXSource;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 *
 * @author roger
 */
public class Test {
 
    public static void main(String[] args) {
        try {
            
            List<Activity> list = null;
            List<Lap> laps = null;
            Track track = null;
//            List<TrackPoint> tracks = null;
            
            JAXBContext jc = JAXBContext.newInstance(TrainingCenterDatabase.class);
            Unmarshaller u = jc.createUnmarshaller();
            //Create an XMLReader to use with our filter
            XMLReader reader = XMLReaderFactory.createXMLReader();
            //Create the filter (to add namespace) and set the xmlReader as its parent.
            NamespaceFilter inFilter = new NamespaceFilter(null, true);
            inFilter.setParent(reader);
            //Prepare the input, in this case a java.io.File (output)
            InputSource is = new InputSource(new FileInputStream(new File("rota2.tcx")));
            //Create a SAXSource specifying the filter
            SAXSource source = new SAXSource(inFilter, is);
            //Do unmarshalling
            TrainingCenterDatabase tcd = (TrainingCenterDatabase)u.unmarshal(source);
            
            list = tcd.getActivities().getList();
            
            SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
           
            int totalLap = 0;
            double totalMetros = 0;
            double totalSeconds = 0;
            String start = null;
            
            for(Activity activity : list){
                laps = activity.getLaps();
                
                for(Lap lap : laps){
                    
//                    track = lap.getTrack();
//                    tracks = track.getTracks();
                    
                    String yourDate=sdf.format(lap.getStartTime());
                     
                    
                    if(laps.indexOf(lap) == 0)
                        start = yourDate;
                    
                    totalLap =  laps.indexOf(lap)+1;
                     
                    //Start time Lap
                    System.out.println("\nLap " + totalLap);
                    System.out.println("Hora inicio Lap: " + yourDate);
                    
                    //Tempo total lap
                    System.out.println("Tempo total Lap (h:m:s): " +  LocalTime.MIN.plusSeconds((int)lap.getTotalTimeSeconds()).toString());
                    //Distância total lap
                    System.out.println("Distância Lap (metros): " + String.format("%.2f", lap.getDistanceMeters()));
                    totalMetros += lap.getDistanceMeters();
                    totalSeconds += lap.getTotalTimeSeconds();
                }
                
                //Total laps
                System.out.println("Total de laps: " + totalLap);
            }
            System.out.println("\nINFORMAÇÕES GERAIS:");
            System.out.println("Hora de inicio: " + start);
            System.out.println("Total km: " + String.format("%.2f", totalMetros/1000));
            System.out.println("Tempo total H:m:s : " + LocalTime.MIN.plusSeconds((int)totalSeconds).toString());
//            System.out.println();
            
        } catch (JAXBException | SAXException | FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
