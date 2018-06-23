package tr.org.ab.spring.rest.videostore.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tr.org.ab.spring.rest.videostore.authorization.annotation.Authorization;
import tr.org.ab.spring.rest.videostore.order.Order;
import tr.org.ab.spring.rest.videostore.order.fixture.OrderFixture;
import tr.org.ab.spring.rest.videostore.order.service.OrderService;
import tr.org.ab.spring.rest.videostore.user.Role;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/movieorders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ResponseStatus(HttpStatus.CREATED)
    @Authorization(requiredRole = Role.USER)
    @PostMapping
    void createUser(@RequestBody Order order) {
         orderService.addOrder(order);
    }

    @Authorization(requiredRole = Role.ADMIN)
    @GetMapping
    List<Order> getOrders(){
       return orderService.getAllOrders();
    }

    @Authorization(requiredRole = Role.ADMIN)
    @GetMapping("/{id}")
    Order getOrder(String id){
        return orderService.getOrder(id);
    }

    @Authorization(requiredRole = Role.ADMIN)
    @DeleteMapping("/{id}")
    void deleteOrder(String id){
        orderService.deleteOrder(id);
    }

}
