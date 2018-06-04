/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trainingcenter.model;

import java.util.Date;
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
public class Lap {
    
    @XmlAttribute
    private String xmlns;
    @XmlAttribute
    private Date StartTime;
    @XmlElement
    private double TotalTimeSeconds;
    @XmlElement
    private double DistanceMeters;
    @XmlElement
    private double MaximumSpeed;
    @XmlElement
    private int Calories;
    @XmlElement
    private String Intensity;
    @XmlElement
    private int Cadence;
    @XmlElement
    private String TriggerMethod;
    @XmlElement
    private Track Track;
    @XmlElement
    private Extensions Extensions;
    
    public Lap() {
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

    /**
     * @return the Extensions
     */
    public Extensions getExtensions() {
        return Extensions;
    }

    /**
     * @param Extensions the Extensions to set
     */
    public void setExtensions(Extensions Extensions) {
        this.Extensions = Extensions;
    }
    
}
