/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trainingcenter.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author roger
 */
@XmlRootElement
public class TraningCenterDatabase {
    
    private String xmlns;
    private Author Author;
    private List<Activity> Activities;

    public TraningCenterDatabase() {
    }

    public TraningCenterDatabase(String xmlns, Author Author, List<Activity> Activity) {
        this.xmlns = xmlns;
        this.Author = Author;
        this.Activities = Activity;
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
    @XmlAttribute
    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    /**
     * @return the Author
     */
    public Author getAuthor() {
        return Author;
    }

    /**
     * @param Author the Author to set
     */
    @XmlElement
    public void setAuthor(Author Author) {
        this.Author = Author;
    }

    /**
     * @return the Activity
     */
    public List<Activity> getActivities() {
        return Activities;
    }

    /**
     * @param Activities the Activity to set
     */
    @XmlElement
    public void setActivities(List<Activity> Activities) {
        this.Activities = Activities;
    }
    
    
}
