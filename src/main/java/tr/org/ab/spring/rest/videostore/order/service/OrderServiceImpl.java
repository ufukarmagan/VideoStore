package tr.org.ab.spring.rest.videostore.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.org.ab.spring.rest.videostore.movie.Movie;
import tr.org.ab.spring.rest.videostore.order.Order;
import tr.org.ab.spring.rest.videostore.order.repository.OrderRepository;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public void addOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public Order getOrder(String orderId) {
        return orderRepository.findOrderById(orderId);
    }

    @Override
    public void updateOrder(String orderId, Order order) {
        orderRepository.save(order);
    }

    @Override
    public void deleteOrder(String orderId) {
        Order order = getOrder(orderId);
        orderRepository.delete(order);
    }
}
