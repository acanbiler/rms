package com.rms.controller;

import com.rms.model.coffee.CoffeeOrder;
import com.rms.model.order.Order;
import com.rms.model.pizza.Pizza;
import com.rms.model.pizza.PizzaOrder;
import com.rms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private @Autowired
    OrderService orderService;

    @GetMapping(value = "/list")
    public List<Order> listOrders() {
        return orderService.listOrders();
    }

    @PostMapping(value = "/place")
    public void placeOrder(@RequestBody Order order) {
        orderService.placeOrder(order);
    }

    @PostMapping(value = "/advance/{orderId}")
    public boolean advanceOrder(@PathVariable Integer orderId) {
        return orderService.advanceOrder(orderId);
    }

    @PostMapping(value = "/revert/{orderId}")
    public boolean revertOrder(@PathVariable Integer orderId) {
        return orderService.revertOrder(orderId);
    }

    @PostMapping(value = "/pizza")
    public Pizza bakePizza(@RequestBody PizzaOrder pizzaOrder) {
        return orderService.bakePizza(pizzaOrder);
    }

    @PostMapping(value = "/baverage/{baverage}")
    public String prepareBaverage(@PathVariable String baverage) {
        return orderService.prepareBaverage(baverage);
    }

    @PostMapping(value = "/coffee")
    public String prepareCoffee(@RequestBody CoffeeOrder coffeeOrder) {
        return orderService.prepareCoffee(coffeeOrder);
    }
}
