package com.rms.service;

import com.rms.model.entity.Order;
import com.rms.model.factory.AsianCuisineFactoryI;
import com.rms.model.factory.IAbstractMealFactory;
import com.rms.model.factory.IndianCusineFactoryI;
import com.rms.model.factory.TurkishCuisineFactoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService {
    private IAbstractMealFactory abstractMealFactory;
    /*
    private @Autowired
    OrderRepository orderRepository;

    @Transactional
    public List<Order> listOrders() {
        return orderRepository.findAll();
    }
    */
    public void placeOrderByCuisine(String type) {
        if (type == "Turkish") {
            abstractMealFactory = new TurkishCuisineFactoryI();
            abstractMealFactory.cookMeal();
            abstractMealFactory.prepareBeverage();
        }
        if (type == "Asian") {
            abstractMealFactory = new AsianCuisineFactoryI();
            abstractMealFactory.cookMeal();
            abstractMealFactory.prepareBeverage();
        }
        if (type == "Indian") {
            abstractMealFactory = new IndianCusineFactoryI();
            abstractMealFactory.cookMeal();
            abstractMealFactory.prepareBeverage();
        }
    }
}
