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
public class Version {
    
    private int VersionMajor;
    private int VersionMinor;

    public Version() {
    }

    public Version(int VersionMajor, int VersionMinor) {
        this.VersionMajor = VersionMajor;
        this.VersionMinor = VersionMinor;
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
