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
    
    @XmlElement(name="VersionMinor")
    private int versionMinor;
    @XmlElement(name="VersionMajor")
    private int versionMajor;
    @XmlElement(name="BuildMinor")
    private int buildMinor = 0;
    @XmlElement(name="BuildMajor")
    private int buildMajor = 0;

    public Version() {
    }

    /**
     * @return the VersionMajor
     */
    public int getVersionMajor() {
        return versionMajor;
    }

    /**
     * @param VersionMajor the VersionMajor to set
     */
    public void setVersionMajor(int VersionMajor) {
        this.versionMajor = VersionMajor;
    }

    /**
     * @return the VersionMinor
     */
    public int getVersionMinor() {
        return versionMinor;
    }

    /**
     * @param VersionMinor the VersionMinor to set
     */
    public void setVersionMinor(int VersionMinor) {
        this.versionMinor = VersionMinor;
    }

    /**
     * @return the buildMinor
     */
    public int getBuildMinor() {
        return buildMinor;
    }

    /**
     * @param buildMinor the buildMinor to set
     */
    public void setBuildMinor(int buildMinor) {
        this.buildMinor = buildMinor;
    }

    /**
     * @return the buildMajor
     */
    public int getBuildMajor() {
        return buildMajor;
    }

    /**
     * @param buildMajor the buildMajor to set
     */
    public void setBuildMajor(int buildMajor) {
        this.buildMajor = buildMajor;
    }
    
    
}
