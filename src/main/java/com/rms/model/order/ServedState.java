package com.rms.model.order;

import com.rms.model.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServedState implements OrderState {

    private final Integer status=3;
    private @Autowired
    OrderRepository orderRepository;

    public ServedState(Order order) {
        List<Order> persistentOrderList = orderRepository.findByOrderId(order.getOrderId());

        for(Order ord: persistentOrderList ){
            ord.setStatus(this.status);

        }
    }

    @Override
    public String next(Order ord) {
        return "The package is in its final state.";
    }

    @Override
    public String prev(Order ord) {

        ord.setState(new ReadyState(ord));
        return "successful";
    }

    @Override
    public void printStatus() {
        System.out.println("Package delivered to post office, not received yet.");
    }
}