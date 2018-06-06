/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trainingcenter.model;

import java.util.Date;
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
    
    @XmlAttribute(name="Sport")
    private String sport;
    @XmlElement(name="Id")
    private Date id;
    @XmlElement(name="Lap")
    private List<Lap> laps;

    public Activity() {
    }

    /**
     * @return the Sport
     */
    public String getSport() {
        return sport;
    }

    /**
     * @param Sport the Sport to set
     */
    public void setSport(String Sport) {
        this.sport = Sport;
    }

    /**
     * @return the Id
     */
    public Date getId() {
        return id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(Date Id) {
        this.id = Id;
    }

    /**
     * @return the Laps
     */
    public List<Lap> getLaps() {
        return laps;
    }

    /**
     * @param Laps the Laps to set
     */
    public void setLaps(List<Lap> Laps) {
        this.laps = Laps;
    }
    
    /**
     * @param Lap to add
     */
    public void addLap(Lap Lap){
        laps.add(Lap);
    }
    
    /**
     * @param index of Lap
     * @param Lap to change
     */
    public void setLap(int index, Lap Lap){
        laps.set(index, Lap);
    }
    
    /**
     * @param index of Lap to remove
     */
    public void remLap(int index){
        laps.remove(index);
    }
    
}
