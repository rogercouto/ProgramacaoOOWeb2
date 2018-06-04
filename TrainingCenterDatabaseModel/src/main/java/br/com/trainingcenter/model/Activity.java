/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trainingcenter.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author roger
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Activity {
    
    @XmlAttribute
    private String Sport;
    @XmlElement
    private int Id;
    @XmlElement
    private List<Lap> Laps;

    public Activity() {
    }

    /**
     * @return the Sport
     */
    public String getSport() {
        return Sport;
    }

    /**
     * @param Sport the Sport to set
     */
    public void setSport(String Sport) {
        this.Sport = Sport;
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Laps
     */
    public List<Lap> getLaps() {
        return Laps;
    }

    /**
     * @param Laps the Laps to set
     */
    public void setLaps(List<Lap> Laps) {
        this.Laps = Laps;
    }
    
    /**
     * @param Lap to add
     */
    public void addLap(Lap Lap){
        Laps.add(Lap);
    }
    
    /**
     * @param index of Lap
     * @param Lap to change
     */
    public void setLap(int index, Lap Lap){
        Laps.set(index, Lap);
    }
    
    /**
     * @param index of Lap to remove
     */
    public void remLap(int index){
        Laps.remove(index);
    }
    
}
