
package de.hsbochum.fbg.kswe.tdd.orders;

import java.io.File;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class OrderManagerTest {
    
    @Test
    public void testOM() {
        File f = null;
        Customer c = new Customer("Blubb", "Bla");
        Product p = new Product("lilalu", f);    
        ProductDeliveryService pds = new ProductDeliveryService ();
        OrderManager om = new OrderManager(pds);
        Order o = new Order(c,2,p);
        Order o2 = new Order(c,1,p);
        om.submitOrder(o);
        om.submitOrder(o2);

        Assert.assertThat(om.getQueuedOrders().get(0), CoreMatchers.is(o));
        
        om.processOrders();
        
        Assert.assertThat(om.getQueuedOrders().size(), CoreMatchers.is(0));
    }
}
