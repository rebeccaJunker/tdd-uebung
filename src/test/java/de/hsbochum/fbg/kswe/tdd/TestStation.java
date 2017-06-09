
package de.hsbochum.fbg.kswe.tdd;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import de.hsbochum.fbg.kswe.tdd.Station;
import org.hamcrest.CoreMatchers;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class TestStation {
    
    @Test
    public void testStation() {
        GeometryFactory gf = new GeometryFactory();
        Point loc1 = gf.createPoint(new Coordinate(0.0, 20.0));
        Point loc2 = gf.createPoint(new Coordinate(10.0, 20.0));
        Station station = new Station(loc1, "Blubb");
        Station station2 = new Station(loc2, "Bla");
        TimeSeries ts = new TimeSeries("waterGauge");
        ts.addObservation(new Observation(12.2, new DateTime("2017-06-06T12:00:00+01:00"), "m"));
        ts.addObservation(new Observation(1240, new DateTime("2017-06-06T12:30:00+01:00"), "cm"));
        ts.addObservation(new Observation(14400, new DateTime("2017-06-06T13:00:00+01:00"), "mm"));
        station.addTimeSeries(ts);
        
        
        Assert.assertThat(station.calculateDistance(station, station2), CoreMatchers.is(10.0));
        Assert.assertThat(station.getTimeSeries(), CoreMatchers.is(station.tslist));
    }
   
}