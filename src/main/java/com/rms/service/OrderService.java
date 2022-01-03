package com.rms.service;

import com.rms.model.factory.AsianCuisineFactory;
import com.rms.model.factory.AbstractMealFactory;
import com.rms.model.factory.IndianCusineFactory;
import com.rms.model.factory.TurkishCuisineFactory;
import com.rms.model.order.Order;
import com.rms.model.order.OrderedState;
import com.rms.model.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderService {
    private AbstractMealFactory abstractMealFactory;

    private @Autowired
    OrderRepository orderRepository;

    @Transactional
    public List<Order> listOrders() {
        return orderRepository.findAll();
    }

    public void placeOrder(List<Order> orderList){
        for (Order ord: orderList){
            ord.setState(new OrderedState(ord));
        }
    }

    public void placeOrderByCuisine(String type) {
        if (type == "Turkish") {
            abstractMealFactory = new TurkishCuisineFactory();
        }
        if (type == "Asian") {
            abstractMealFactory = new AsianCuisineFactory();
        }
        if (type == "Indian") {
            abstractMealFactory = new IndianCusineFactory();
        }

        prepareMealByCuisine(abstractMealFactory);
    }

    public void prepareMealByCuisine(AbstractMealFactory abstractMealFactory) {
        abstractMealFactory.cookMeal();
        abstractMealFactory.prepareBeverage();
    }
}
