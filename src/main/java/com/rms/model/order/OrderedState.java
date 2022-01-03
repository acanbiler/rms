package com.rms.model.order;

import com.rms.model.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderedState implements OrderState {

    private final Integer status=1;
    private @Autowired
    OrderRepository orderRepository;

    public OrderedState(Order order) {
        order.setStatus(this.status);
        orderRepository.save(order);
    }

    public OrderedState(ReadyState readyState) {
    }

    @Override
    public String next(Order ord) {
        ord.setState(new ReadyState(ord));
        return "successful";
    }

    @Override
    public String prev(Order ord) {
        return "The package is in its root state.";
    }

    @Override
    public void printStatus() {
        System.out.println("Package ordered, not delivered to the office yet.");
    }
}