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
    
    @XmlElement
    private Date Time;
    @XmlElement
    private double AltitudeMeters;
    @XmlElement
    private double DistanceMeters;
    @XmlElement
    private int Cadence;
    @XmlElement
    private String SensorState;
    @XmlElement
    private Position position;

    public TrackPoint() {
    }

    /**
     * @return the Time
     */
    public Date getTime() {
        return Time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(Date Time) {
        this.Time = Time;
    }

    /**
     * @return the AltitudeMeters
     */
    public double getAltitudeMeters() {
        return AltitudeMeters;
    }

    /**
     * @param AltitudeMeters the AltitudeMeters to set
     */
    public void setAltitudeMeters(double AltitudeMeters) {
        this.AltitudeMeters = AltitudeMeters;
    }

    /**
     * @return the DistanceMeters
     */
    public double getDistanceMeters() {
        return DistanceMeters;
    }

    /**
     * @param DistanceMeters the DistanceMeters to set
     */
    public void setDistanceMeters(double DistanceMeters) {
        this.DistanceMeters = DistanceMeters;
    }

    /**
     * @return the Cadence
     */
    public int getCadence() {
        return Cadence;
    }

    /**
     * @param Cadence the Cadence to set
     */
    public void setCadence(int Cadence) {
        this.Cadence = Cadence;
    }

    /**
     * @return the SensorState
     */
    public String getSensorState() {
        return SensorState;
    }

    /**
     * @param SensorState the SensorState to set
     */
    public void setSensorState(String SensorState) {
        this.SensorState = SensorState;
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
