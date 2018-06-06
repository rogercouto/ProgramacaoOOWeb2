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
public class LX {
    
    @XmlElement(name="AvgSpeed")
    private double avgSpeed;

    public LX() {
    }

    /**
     * @return the avgString
     */
    public double getAvgSpeed() {
        return avgSpeed;
    }

    /**
     * @param AvgSpeed the avgString to set
     */
    public void setAvgSpeed(double AvgSpeed) {
        this.avgSpeed = AvgSpeed;
    }
    
}
