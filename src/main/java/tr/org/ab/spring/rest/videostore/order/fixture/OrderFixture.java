package tr.org.ab.spring.rest.videostore.order.fixture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tr.org.ab.spring.rest.videostore.order.Order;
import tr.org.ab.spring.rest.videostore.order.service.OrderService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class OrderFixture {

        @Autowired
        private OrderService orderService;

        @PostConstruct
        public void addTestOrders() {

            List<String> list = new ArrayList<String>();
            list.add("m-1");
            list.add("m-2");

            Order order = new Order()
                    .setId("123")
                    .setUserId("321")
                    .setAdress("first adress")
                    .setMoviesId(list)
                    .setTotalAmount(123);

            Order order2 = new Order()
                    .setId("321")
                    .setUserId("654")
                    .setAdress("second adress")
                    .setMoviesId(list)
                    .setTotalAmount(321);


            orderService.addOrder(order);
            orderService.addOrder(order2);
        }


}
