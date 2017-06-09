
package de.hsbochum.fbg.kswe.tdd.orders;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class OrderManager {

    private final ProductDeliveryService delivery;
    private final List<Product> queuedOrders = new LinkedList<>();

    public OrderManager(ProductDeliveryService delivery) {
        this.delivery = delivery;
    }
    
}
