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
public class Author {
    
    @XmlAttribute(name = "xmlns:xsi")
    private String xmlns;
    @XmlAttribute(name="xsi:type")
    private String xsiType;
    @XmlElement
    private String Name;
    @XmlElement
    private Build Build;
    @XmlElement
    private String LangID;
    @XmlElement
    private String PartNumber;

    public Author() {
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the LangID
     */
    public String getLangID() {
        return LangID;
    }

    /**
     * @param LangID the LangID to set
     */
    public void setLangID(String LangID) {
        this.LangID = LangID;
    }

    /**
     * @return the PartNumber
     */
    public String getPartNumber() {
        return PartNumber;
    }

    /**
     * @param PartNumber the PartNumber to set
     */
    public void setPartNumber(String PartNumber) {
        this.PartNumber = PartNumber;
    }

    /**
     * @return the Build
     */
    public Build getBuild() {
        return Build;
    }

    /**
     * @param Build the Build to set
     */
    public void setBuild(Build Build) {
        this.Build = Build;
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
     * @return the xsiType
     */
    public String getXsiType() {
        return xsiType;
    }

    /**
     * @param xsiType the xsiType to set
     */
    public void setXsiType(String xsiType) {
        this.xsiType = xsiType;
    }
    
}
