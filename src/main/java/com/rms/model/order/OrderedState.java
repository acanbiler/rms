package com.rms.model.order;

import com.rms.model.repository.OrderRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@NoArgsConstructor
public class OrderedState implements OrderState {

    public OrderedState(Order order, OrderRepository orderRepository) {
        Integer status = 1;
        order.setStatus(status);
        orderRepository.save(order);
    }

    public OrderedState(Order order) {
        Integer status = 1;
        order.setStatus(status);
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