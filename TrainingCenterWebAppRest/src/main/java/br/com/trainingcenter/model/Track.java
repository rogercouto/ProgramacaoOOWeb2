package br.com.trainingcenter.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Track {
    
    @XmlElement(name="Trackpoint")
    private List<Trackpoint> trackpoints = new ArrayList<>();

    public Track() {
    }

    /**
     * @return the tracks
     */
    public List<Trackpoint> getTrackpoints() {
        return trackpoints;
    }

    /**
     * @param Trackpoints the tracks to set
     */
    public void setTrackpoint(List<Trackpoint> Trackpoints) {
        this.trackpoints = Trackpoints;
    }
    
    /**
     * Add a track
     * @param Trackpoint to add
     */
    public void addTrackpoint(Trackpoint Trackpoint){
        trackpoints.add(Trackpoint);
    }
    
    /**
     * Changes a track
     * @param index of track to change
     * @param TrackPoint to change
     */
    public void setTrackpoint(int index, Trackpoint TrackPoint){
        trackpoints.set(index, TrackPoint);
    }
    
    /**
     * Remove a track
     * @param index 
     */
    public void remTrackpoint(int index){
        trackpoints.remove(index);
    }
    
}
