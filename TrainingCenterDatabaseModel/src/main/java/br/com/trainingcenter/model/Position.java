/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trainingcenter.model;

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
public class Position {
    
    @XmlElement
    private double LatitudeDegrees;
    @XmlElement
    private double LongitudeDegrees;

    public Position() {
    }

    /**
     * @return the LatitudeDegrees
     */
    public double getLatitudeDegrees() {
        return LatitudeDegrees;
    }

    /**
     * @param LatitudeDegrees the LatitudeDegrees to set
     */
    public void setLatitudeDegrees(double LatitudeDegrees) {
        this.LatitudeDegrees = LatitudeDegrees;
    }

    /**
     * @return the LongitudeDegrees
     */
    public double getLongitudeDegrees() {
        return LongitudeDegrees;
    }

    /**
     * @param LongitudeDegrees the LongitudeDegrees to set
     */
    public void setLongitudeDegrees(double LongitudeDegrees) {
        this.LongitudeDegrees = LongitudeDegrees;
    }
    
}
