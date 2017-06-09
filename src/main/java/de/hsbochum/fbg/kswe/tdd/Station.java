
package de.hsbochum.fbg.kswe.tdd;

import com.vividsolutions.jts.geom.Point;
import java.util.List;
import de.hsbochum.fbg.kswe.tdd.TimeSeries;
import java.util.ArrayList;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class Station {
    
    private Point location;
    private String name;
    List<TimeSeries> tslist;
    

    public Station(Point location, String name) {
        this.location = location;
        this.name = name;
        tslist = new ArrayList<TimeSeries>();
    }
    
    public double calculateDistance(Station stat1, Station stat2){
        return Math.sqrt(Math.pow(stat1.location.getCoordinate().x-stat2.location.getCoordinate().x,2)+
                Math.pow(stat1.location.getCoordinate().y-stat2.location.getCoordinate().y,2));
    }

    
    void addTimeSeries(TimeSeries ts){
        tslist.add(ts);
    }
    
    List<TimeSeries> getTimeSeries(){
        return tslist;
    }
    
    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
