package br.com.trainingcenter.model;

import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Activity {
    
    @XmlAttribute(name="Sport")
    private String sport;
    @XmlElement(name="Id")
    private Date id;
    @XmlElement(name="Lap")
    private List<Lap> laps;
    @XmlElement(name="Training")
    private Training training;
    @XmlElement(name="Creator")        
    private Creator creator;

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

    /**
     * @return the training
     */
    public Training getTraining() {
        return training;
    }

    /**
     * @param training the training to set
     */
    public void setTraining(Training training) {
        this.training = training;
    }

    /**
     * @return the creator
     */
    public Creator getCreator() {
        return creator;
    }

    /**
     * @param creator the creator to set
     */
    public void setCreator(Creator creator) {
        this.creator = creator;
    }
    
}
