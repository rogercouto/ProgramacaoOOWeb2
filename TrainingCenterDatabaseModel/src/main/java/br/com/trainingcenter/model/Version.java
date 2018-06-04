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
public class Version {
    
    @XmlElement
    private int VersionMinor;
    @XmlElement
    private int VersionMajor;

    public Version() {
    }

    /**
     * @return the VersionMajor
     */
    public int getVersionMajor() {
        return VersionMajor;
    }

    /**
     * @param VersionMajor the VersionMajor to set
     */
    public void setVersionMajor(int VersionMajor) {
        this.VersionMajor = VersionMajor;
    }

    /**
     * @return the VersionMinor
     */
    public int getVersionMinor() {
        return VersionMinor;
    }

    /**
     * @param VersionMinor the VersionMinor to set
     */
    public void setVersionMinor(int VersionMinor) {
        this.VersionMinor = VersionMinor;
    }
    
    
}
