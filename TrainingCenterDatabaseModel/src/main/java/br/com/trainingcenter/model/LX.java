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
public class LX {
    
    private String xmlns;
    private double AvgSpeed;

    public LX() {
    }

    public LX(String xmlns, double AvgSpeed) {
        this.xmlns = xmlns;
        this.AvgSpeed = AvgSpeed;
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
