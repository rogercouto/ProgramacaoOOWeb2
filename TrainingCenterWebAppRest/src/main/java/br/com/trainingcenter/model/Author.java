package br.com.trainingcenter.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Author {
    
    @XmlElement(name="Name")
    private String name;
    @XmlElement(name="Build")
    private Build build;
    @XmlElement(name="LangID")
    private String langID;
    @XmlElement(name="PartNumber")
    private String partNumber;

    public Author() {
    }

    /**
     * @return the Name
     */
    public String getName() {
        return name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.name = Name;
    }

    /**
     * @return the LangID
     */
    public String getLangID() {
        return langID;
    }

    /**
     * @param LangID the LangID to set
     */
    public void setLangID(String LangID) {
        this.langID = LangID;
    }

    /**
     * @return the PartNumber
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * @param PartNumber the PartNumber to set
     */
    public void setPartNumber(String PartNumber) {
        this.partNumber = PartNumber;
    }

    /**
     * @return the Build
     */
    public Build getBuild() {
        return build;
    }

    /**
     * @param Build the Build to set
     */
    public void setBuild(Build Build) {
        this.build = Build;
    }
    
}
