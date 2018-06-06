/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trainingcenter.model;

import java.util.ArrayList;
import java.util.List;
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
public class Track {
    
    @XmlElement(name="TrackPoint")
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public Track() {
    }

    /**
     * @return the tracks
     */
    public List<TrackPoint> getTracks() {
        return trackPoints;
    }

    /**
     * @param TrackPoints the tracks to set
     */
    public void setTracks(List<TrackPoint> TrackPoints) {
        this.trackPoints = TrackPoints;
    }
    
    /**
     * Add a track
     * @param TrackPoint to add
     */
    public void addTrack(TrackPoint TrackPoint){
        trackPoints.add(TrackPoint);
    }
    
    /**
     * Changes a track
     * @param index of track to change
     * @param TrackPoint to change
     */
    public void setTrack(int index, TrackPoint TrackPoint){
        trackPoints.set(index, TrackPoint);
    }
    
    /**
     * Remove a track
     * @param index 
     */
    public void remTrack(int index){
        trackPoints.remove(index);
    }
    
}
