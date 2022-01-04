package com.rms.model.order;

import com.rms.model.repository.OrderRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@NoArgsConstructor
public class ServedState implements OrderState {

    public ServedState(Order order) {
        Integer status = 3;
        order.setStatus(status);
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