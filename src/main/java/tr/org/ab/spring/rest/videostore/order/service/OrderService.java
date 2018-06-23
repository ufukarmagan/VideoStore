package tr.org.ab.spring.rest.videostore.order.service;

import tr.org.ab.spring.rest.videostore.order.Order;

import java.util.List;

public interface OrderService {
    void addOrder(Order order);
    Order getOrder(String orderId);
    void updateOrder(String orderId,Order order);
    void deleteOrder(String orderId);
    List<Order> getAllOrders();
}
