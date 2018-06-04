/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.trainingcenter.model;

/**
 *
 * @author roger
 */
public class Author {
    
    private String Name;
    private String LangID;
    private String PartNumber;
    private Build Build;

    public Author() {
    }

    public Author(String Name, String LangID, String PartNumber, Build Build) {
        this.Name = Name;
        this.LangID = LangID;
        this.PartNumber = PartNumber;
        this.Build = Build;
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
    
}
