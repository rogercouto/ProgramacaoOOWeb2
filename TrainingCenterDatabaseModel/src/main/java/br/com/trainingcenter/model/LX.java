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
    
    @XmlAttribute
    private String xmlns;
    @XmlElement
    private double AvgSpeed;

    public LX() {
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
     * @return the avgString
     */
    public double getAvgSpeed() {
        return AvgSpeed;
    }

    /**
     * @param AvgSpeed the avgString to set
     */
    public void setAvgSpeed(double AvgSpeed) {
        this.AvgSpeed = AvgSpeed;
    }
    
}
