package com.rms.controller;

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
    public void advanceOrder(@PathVariable Integer orderId) {
        orderService.advanceOrder(orderId);
    }

    @PostMapping(value = "/revert/{orderId}")
    public void revertOrder(@PathVariable Integer orderId) {
        orderService.revertOrder(orderId);
    }

    @PostMapping(value = "/pizza")
    public Pizza bakePizza(@RequestBody PizzaOrder pizzaOrder) {
        return orderService.bakePizza(pizzaOrder);
    }
}
