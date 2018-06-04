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
public class Lap {
    
    private String xmlns;
    private Date StartTime;
    private double TotalTimeSeconds;
    private double DistanceMeters;
    private double MaximumSpeed;
    private int Calories;
    private String Intensity;
    private int Cadence;
    private String TriggerMethod;
    private Track Track;

    public Lap() {
    }

    public Lap(String xmlns, Date StartTime, double TotalTimeSeconds, double DistanceMeters, double MaximumSpeed, int Calories, String Intensity, int Cadence, String TriggerMethod, Track Track) {
        this.xmlns = xmlns;
        this.StartTime = StartTime;
        this.TotalTimeSeconds = TotalTimeSeconds;
        this.DistanceMeters = DistanceMeters;
        this.MaximumSpeed = MaximumSpeed;
        this.Calories = Calories;
        this.Intensity = Intensity;
        this.Cadence = Cadence;
        this.TriggerMethod = TriggerMethod;
        this.Track = Track;
    }

    /**
     * @return the xmlns
     */
    public String getXmlns() {
        return xmlns;
    }

    /**
     * @param xmlns the xmlns to set
     */
    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    /**
     * @return the StartTime
     */
    public Date getStartTime() {
        return StartTime;
    }

    /**
     * @param StartTime the StartTime to set
     */
    public void setStartTime(Date StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * @return the TotalTimeSeconds
     */
    public double getTotalTimeSeconds() {
        return TotalTimeSeconds;
    }

    /**
     * @param TotalTimeSeconds the TotalTimeSeconds to set
     */
    public void setTotalTimeSeconds(double TotalTimeSeconds) {
        this.TotalTimeSeconds = TotalTimeSeconds;
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
     * @return the MaximumSpeed
     */
    public double getMaximumSpeed() {
        return MaximumSpeed;
    }

    /**
     * @param MaximumSpeed the MaximumSpeed to set
     */
    public void setMaximumSpeed(double MaximumSpeed) {
        this.MaximumSpeed = MaximumSpeed;
    }

    /**
     * @return the Calories
     */
    public int getCalories() {
        return Calories;
    }

    /**
     * @param Calories the Calories to set
     */
    public void setCalories(int Calories) {
        this.Calories = Calories;
    }

    /**
     * @return the Intensity
     */
    public String getIntensity() {
        return Intensity;
    }

    /**
     * @param Intensity the Intensity to set
     */
    public void setIntensity(String Intensity) {
        this.Intensity = Intensity;
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
     * @return the TriggerMethod
     */
    public String getTriggerMethod() {
        return TriggerMethod;
    }

    /**
     * @param TriggerMethod the TriggerMethod to set
     */
    public void setTriggerMethod(String TriggerMethod) {
        this.TriggerMethod = TriggerMethod;
    }

    /**
     * @return the Track
     */
    public Track getTrack() {
        return Track;
    }

    /**
     * @param Track the Track to set
     */
    public void setTrack(Track Track) {
        this.Track = Track;
    }
    
}
