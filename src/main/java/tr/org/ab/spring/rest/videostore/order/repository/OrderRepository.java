package tr.org.ab.spring.rest.videostore.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.org.ab.spring.rest.videostore.order.Order;
import tr.org.ab.spring.rest.videostore.user.User;

import java.util.Collection;

@Repository
public interface OrderRepository extends JpaRepository<Order,String> {
    Order findOrderById(String orderId);
}
