/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trainingcenter.model;

import java.util.Date;

/**
 *
 * @author roger
 */
public class TrackPoint {
    
    private Date Time;
    private double AltitudeMeters;
    private double DistanceMeters;
    private int Cadence;
    private String SensorState;

    public TrackPoint() {
    }

    public TrackPoint(Date Time, double AltitudeMeters, double DistanceMeters, int Cadence, String SensorState) {
        this.Time = Time;
        this.AltitudeMeters = AltitudeMeters;
        this.DistanceMeters = DistanceMeters;
        this.Cadence = Cadence;
        this.SensorState = SensorState;
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
    
    
}
