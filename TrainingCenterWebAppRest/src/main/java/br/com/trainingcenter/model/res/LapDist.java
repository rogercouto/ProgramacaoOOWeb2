package br.com.trainingcenter.model.res;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe utilizada para retornar apenas as laps e a distancia de cada uma
 */
@XmlRootElement(name="Lap")
@XmlAccessorType(XmlAccessType.FIELD)
public class LapDist {
    
    @XmlAttribute(name="Number")
    private int number;
    @XmlElement(name="DistanceMeters")
    private double distanceMeters;

    public LapDist() {
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the distanceMeters
     */
    public double getDistanceMeters() {
        return distanceMeters;
    }

    /**
     * @param distanceMeters the distanceMeters to set
     */
    public void setDistanceMeters(double distanceMeters) {
        this.distanceMeters = distanceMeters;
    }
    
}
