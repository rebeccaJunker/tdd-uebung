
package de.hsbochum.fbg.kswe.tdd;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import org.hamcrest.CoreMatchers;
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
        
        Assert.assertThat(station.calculateDistance(loc1, loc2), CoreMatchers.is(10.0);
    }
   
}