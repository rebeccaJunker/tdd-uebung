/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsbochum.fbg.kswe.tdd;

import de.hsbochum.fbg.kswe.tdd.Observation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felix
 */
public class TimeSeries {
    String observationType;
    List<Observation> observationList;
    
    
    public TimeSeries (String observationType) {
        this.observationType = observationType;
        observationList = new ArrayList<Observation>();
    }

    void addObservation(Observation observation) {
        observationList.add(observation);
    }
    
    double calculateMean(String masseinheit) {
        double mean;
        double summe=0;
        
        
        for (int i=0; i < observationList.size(); i++) {
            double value = observationList.get(i).value;
            if (observationList.get(i).masseinheit == "mm"){
                value = value / 1000;
            }
            else if (observationList.get(i).masseinheit == "cm"){
                value = value / 100;
            }
             else if (observationList.get(i).masseinheit == "dm"){
                value = value / 10;
            }
            summe = summe+value;

        }
        mean = summe / observationList.size();
        
        switch (masseinheit)
        {
            case "m":
                mean=mean;
                break;
            case "dm":
                mean=mean*10;
                break;
            case "cm":
                mean=mean*100;
                break;
            case "mm":
                mean=mean*1000;
                break;
        }
        return mean;
    }
}
