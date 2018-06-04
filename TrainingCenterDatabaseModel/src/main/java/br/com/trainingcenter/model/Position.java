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
public class Position {
    
    private double LatitudeDegrees;
    private double LongitudeDegrees;

    public Position() {
    }

    public Position(double LatitudeDegrees, double LongitudeDegrees) {
        this.LatitudeDegrees = LatitudeDegrees;
        this.LongitudeDegrees = LongitudeDegrees;
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
