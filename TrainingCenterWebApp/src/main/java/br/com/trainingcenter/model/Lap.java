package br.com.trainingcenter.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Lap {
    
    @XmlAttribute(name="StartTime")
    private Date startTime;
    @XmlElement(name="TotalTimeSeconds")
    private double totalTimeSeconds;
    @XmlElement(name="DistanceMeters")
    private double distanceMeters;
    @XmlElement(name="MaximumSpeed")
    private double maximumSpeed;
    @XmlElement(name="Calories")
    private int Calories;
    @XmlElement(name="Intensity")
    private String intensity;
    @XmlElement(name="cadence")
    private int cadence;
    @XmlElement(name="triggerMethod")
    private String triggerMethod;
    @XmlElement(name="Track")
    private Track track;
    @XmlElement(name="Extensions")
    private Extensions extensions;
    
    public Lap() {
    }

    /**
     * @return the StartTime
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param StartTime the StartTime to set
     */
    public void setStartTime(Date StartTime) {
        this.startTime = StartTime;
    }

    /**
     * @return the TotalTimeSeconds
     */
    public double getTotalTimeSeconds() {
        return totalTimeSeconds;
    }

    /**
     * @param TotalTimeSeconds the TotalTimeSeconds to set
     */
    public void setTotalTimeSeconds(double TotalTimeSeconds) {
        this.totalTimeSeconds = TotalTimeSeconds;
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
     * @return the MaximumSpeed
     */
    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    /**
     * @param MaximumSpeed the MaximumSpeed to set
     */
    public void setMaximumSpeed(double MaximumSpeed) {
        this.maximumSpeed = MaximumSpeed;
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
        return intensity;
    }

    /**
     * @param Intensity the Intensity to set
     */
    public void setIntensity(String Intensity) {
        this.intensity = Intensity;
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
     * @return the TriggerMethod
     */
    public String getTriggerMethod() {
        return triggerMethod;
    }

    /**
     * @param TriggerMethod the TriggerMethod to set
     */
    public void setTriggerMethod(String TriggerMethod) {
        this.triggerMethod = TriggerMethod;
    }

    /**
     * @return the Track
     */
    public Track getTrack() {
        return track;
    }

    /**
     * @param Track the Track to set
     */
    public void setTrack(Track Track) {
        this.track = Track;
    }

    /**
     * @return the Extensions
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * @param Extensions the Extensions to set
     */
    public void setExtensions(Extensions Extensions) {
        this.extensions = Extensions;
    }
    
}
