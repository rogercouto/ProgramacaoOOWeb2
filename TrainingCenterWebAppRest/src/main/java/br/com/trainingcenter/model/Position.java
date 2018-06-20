package br.com.trainingcenter.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Position {
    
    @XmlElement(name="LatitudeDegrees")
    private double latitudeDegrees;
    @XmlElement(name="LongitudeDegrees")
    private double longitudeDegrees;

    public Position() {
    }

    /**
     * @return the LatitudeDegrees
     */
    public double getLatitudeDegrees() {
        return latitudeDegrees;
    }

    /**
     * @param LatitudeDegrees the LatitudeDegrees to set
     */
    public void setLatitudeDegrees(double LatitudeDegrees) {
        this.latitudeDegrees = LatitudeDegrees;
    }

    /**
     * @return the LongitudeDegrees
     */
    public double getLongitudeDegrees() {
        return longitudeDegrees;
    }

    /**
     * @param LongitudeDegrees the LongitudeDegrees to set
     */
    public void setLongitudeDegrees(double LongitudeDegrees) {
        this.longitudeDegrees = LongitudeDegrees;
    }
    
}
