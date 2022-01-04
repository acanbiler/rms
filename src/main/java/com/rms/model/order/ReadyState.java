package com.rms.model.order;

import com.rms.model.repository.OrderRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@NoArgsConstructor
public class ReadyState implements OrderState {

    public ReadyState(Order order) {
        Integer status = 2;
        order.setStatus(status);
    }

    @Override
    public String next(Order ord) {
        ord.setState(new ServedState(ord));
        return "successful";
    }

    @Override
    public String prev(Order ord) {
        ord.setState(new OrderedState(ord));
        return "successful";
    }

    @Override
    public void printStatus() {
        System.out.println("Package delivered to post office, not received yet.");
    }
}