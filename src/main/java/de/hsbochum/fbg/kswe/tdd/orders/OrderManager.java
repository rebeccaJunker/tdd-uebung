
package de.hsbochum.fbg.kswe.tdd.orders;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class OrderManager {

    private final ProductDeliveryService delivery;
    private final List<Order> queuedOrders = new LinkedList<>();

    public OrderManager(ProductDeliveryService delivery) {
        this.delivery = delivery;
    }

    void submitOrder(Order o) {
        queuedOrders.add(o);
    }

    List<Order> getQueuedOrders() {
        return queuedOrders;
    }

    void processOrders() {
        queuedOrders.sort((o1, o2) -> {
            o1.getPriority();
            o2.getPriority();
            return o1.getPriority()-o2.getPriority(); //To change body of generated lambdas, choose Tools | Templates.
        });
        while (queuedOrders.size() != 0) {
            Product p = queuedOrders.get(0).getProduct();
            Customer c = queuedOrders.get(0).getCustomer();
            delivery.deliver(p, c);
            queuedOrders.remove(0);
        }
    }
}
