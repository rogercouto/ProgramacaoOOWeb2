/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trainingcenter.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roger
 */
public class Track {
    
    private List<Track> Tracks = new ArrayList<>();

    public Track() {
    }

    public Track(List<Track> Tracks) {
        this.Tracks = Tracks;
    }
    
    /**
     * @return the tracks
     */
    public List<Track> getTracks() {
        return Tracks;
    }

    /**
     * @param Tracks the tracks to set
     */
    public void setTracks(List<Track> Tracks) {
        this.Tracks = Tracks;
    }
    
    /**
     * Add a track
     * @param Track to add
     */
    public void addTrack(Track Track){
        Tracks.add(Track);
    }
    
    /**
     * Changes a track
     * @param index of track to change
     * @param Track to change
     */
    public void setTrack(int index, Track Track){
        Tracks.set(index, Track);
    }
    
    /**
     * Remove a track
     * @param index 
     */
    public void remTrack(int index){
        Tracks.remove(index);
    }
    
}
