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
public class Extensions {
    
    @XmlElement(name="Lx")
    private LX lx;

    public Extensions() {
    }

    /**
     * @return the lx
     */
    public LX getLx() {
        return lx;
    }

    /**
     * @param Lx the lx to set
     */
    public void setLx(LX Lx) {
        this.lx = Lx;
    }
    
    
}
