package com.rms.service;

import com.rms.model.beverage.Beverage;
import com.rms.model.factory.AsianCuisineFactory;
import com.rms.model.factory.AbstractMealFactory;
import com.rms.model.factory.IndianCusineFactory;
import com.rms.model.factory.TurkishCuisineFactory;
import com.rms.model.meal.Meal;
import com.rms.model.order.*;
import com.rms.model.pizza.Pizza;
import com.rms.model.pizza.PizzaOrder;
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

    private @Autowired
    IngredientService ingredientService;

    @Transactional
    public List<Order> listOrders() {
        List<Order> orderList = orderRepository.findAll();
        return orderList;
    }

    public void placeOrder(Order order){
        if (order.getOrderedItem().equals("Turkish") ||
                order.getOrderedItem().equals("Asian") ||
                order.getOrderedItem().equals("Indian")) {
            placeOrderByCuisine(order);
            return;
        }

        order.setState(new OrderedState(order, orderRepository));
    }

    public void advanceOrder(Integer orderId){
        List<Order> persistentOrderList = orderRepository.findByOrderId(orderId);

        for(Order order : persistentOrderList) {
            switch (order.getStatus()) {
                case 1:
                    order.nextState(new OrderedState());
                    break;
                case 2:
                    order.nextState(new ReadyState());
                    break;
            }
        }
        orderRepository.saveAll(persistentOrderList);
    }

    public void revertOrder(Integer orderId){
        List<Order> persistentOrderList = orderRepository.findByOrderId(orderId);

        for(Order order : persistentOrderList) {
            switch (order.getStatus()) {
                case 2:
                    order.previousState(new ReadyState());
                    break;
                case 3:
                    order.previousState(new ServedState());
                    break;
            }
        }
        orderRepository.saveAll(persistentOrderList);
    }

    public void placeOrderByCuisine(Order order) {
        if (order.getOrderedItem().equals("Turkish")) {
            abstractMealFactory = new TurkishCuisineFactory();
        }
        if (order.getOrderedItem().equals("Asian")) {
            abstractMealFactory = new AsianCuisineFactory();
        }
        if (order.getOrderedItem().equals("Indian")) {
            abstractMealFactory = new IndianCusineFactory();
        }

        prepareMealByCuisine(abstractMealFactory, order.getOrderId());
    }

    public void prepareMealByCuisine(AbstractMealFactory abstractMealFactory, Integer orderId) {
        List<Meal> mealList = abstractMealFactory.cookMeal();
        Beverage beverage = abstractMealFactory.prepareBeverage();

        for (Meal meal : mealList) {
            Order order = new Order();
            order.setOrderId(orderId);
            order.setOrderedItem(meal.getName());
            order.setState(new OrderedState(order, orderRepository));
        }

        Order beverageOrder = new Order();
        beverageOrder.setOrderId(orderId);
        beverageOrder.setOrderedItem(beverage.getName());
        beverageOrder.setState(new OrderedState(beverageOrder, orderRepository));
    }

    public Pizza bakePizza(PizzaOrder pizzaOrder) {
        Pizza.PizzaBuilder newPizza = new Pizza.PizzaBuilder(pizzaOrder.getSize());
        if (pizzaOrder.getCheese())
            newPizza.cheese(true);
        if (pizzaOrder.getMushroom())
            newPizza.mushroom(true);
        if (pizzaOrder.getPepperoni())
            newPizza.pepperoni(true);

        return newPizza.build();
    }
}
