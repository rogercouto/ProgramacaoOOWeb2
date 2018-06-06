/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trainingcenter.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author roger
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TrackPoint {
    
    @XmlElement(name="Time")
    private Date time;
    @XmlElement(name="AltitudeMeters")
    private double altitudeMeters;
    @XmlElement(name="DistanceMeters")
    private double distanceMeters;
    @XmlElement(name="Cadence")
    private int cadence;
    @XmlElement(name="SensorState")
    private String sensorState;
    @XmlElement(name="Position")
    private Position position;

    public TrackPoint() {
    }

    /**
     * @return the Time
     */
    public Date getTime() {
        return time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(Date Time) {
        this.time = Time;
    }

    /**
     * @return the AltitudeMeters
     */
    public double getAltitudeMeters() {
        return altitudeMeters;
    }

    /**
     * @param AltitudeMeters the AltitudeMeters to set
     */
    public void setAltitudeMeters(double AltitudeMeters) {
        this.altitudeMeters = AltitudeMeters;
    }

    /**
     * @return the DistanceMeters
     */
    public double getDistanceMeters() {
        return distanceMeters;
    }

    /**
     * @param DistanceMeters the DistanceMeters to set
     */
    public void setDistanceMeters(double DistanceMeters) {
        this.distanceMeters = DistanceMeters;
    }

    /**
     * @return the Cadence
     */
    public int getCadence() {
        return cadence;
    }

    /**
     * @param Cadence the Cadence to set
     */
    public void setCadence(int Cadence) {
        this.cadence = Cadence;
    }

    /**
     * @return the SensorState
     */
    public String getSensorState() {
        return sensorState;
    }

    /**
     * @param SensorState the SensorState to set
     */
    public void setSensorState(String SensorState) {
        this.sensorState = SensorState;
    }

    /**
     * @return the position
     */
    public Position getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Position position) {
        this.position = position;
    }
    
    
}
