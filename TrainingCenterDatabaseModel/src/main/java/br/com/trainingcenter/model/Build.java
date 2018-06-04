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
public class Build {
    
    @XmlElement
    private Version Version;

    public Build() {
    }

    /**
     * @return the Version
     */
    public Version getVersion() {
        return Version;
    }

    /**
     * @param Version the Version to set
     */
    public void setVersion(Version Version) {
        this.Version = Version;
    }
    
}
