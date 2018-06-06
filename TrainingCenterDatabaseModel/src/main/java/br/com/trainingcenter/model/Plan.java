/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trainingcenter.model;

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
public class Plan {
    
    @XmlAttribute(name="Type")
    private String type;
    @XmlAttribute(name="IntervalWorkout")
    private String intervalWorkout;
    @XmlElement(name="Name")
    private String name;
    @XmlElement(name="Extensions")
    private String extensions;

    public Plan() {
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the intervalWorkout
     */
    public String getIntervalWorkout() {
        return intervalWorkout;
    }

    /**
     * @param intervalWorkout the intervalWorkout to set
     */
    public void setIntervalWorkout(String intervalWorkout) {
        this.intervalWorkout = intervalWorkout;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the extensions
     */
    public String getExtensions() {
        return extensions;
    }

    /**
     * @param extensions the extensions to set
     */
    public void setExtensions(String extensions) {
        this.extensions = extensions;
    }
    
}
