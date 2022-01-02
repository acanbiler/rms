package com.rms.service;

import com.rms.model.factory.AsianCuisineFactory;
import com.rms.model.factory.AbstractMealFactory;
import com.rms.model.factory.IndianCusineFactory;
import com.rms.model.factory.TurkishCuisineFactory;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private AbstractMealFactory abstractMealFactory;
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
