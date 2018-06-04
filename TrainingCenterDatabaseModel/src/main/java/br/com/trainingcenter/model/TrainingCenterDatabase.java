/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trainingcenter.model;

import java.util.List;
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
public class TrainingCenterDatabase {
    
    @XmlAttribute
    private String xmlns;
    @XmlElement
    private Author Author;
    @XmlElement
    private List<Activity> Activities;

    public TrainingCenterDatabase() {
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
     * @return the Author
     */
    public Author getAuthor() {
        return Author;
    }

    /**
     * @param Author the Author to set
     */
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
    public void setActivities(List<Activity> Activities) {
        this.Activities = Activities;
    }
    
    
}
