/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsbochum.fbg.kswe.tdd;

import org.joda.time.DateTime;

/**
 *
 * @author Felix
 */
public class Observation {
    double value;
    DateTime time;
    String masseinheit;
    
    public Observation (double value, DateTime time, String masseinheit) {
        this.value=value;
        this.time=time;
        this.masseinheit=masseinheit;
    }
}
