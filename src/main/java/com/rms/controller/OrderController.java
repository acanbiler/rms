package com.rms.controller;

import com.rms.model.order.Order;
import com.rms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private @Autowired
    OrderService orderService;

    @GetMapping(name = "/cuisine/{cuisine}")
    public void placeOrderByCuisine(@PathVariable String cuisine) {
        orderService.placeOrderByCuisine(cuisine);
    }

    @PostMapping(name = "/place")
    public void placeOrder(@RequestBody List<Order> orderList) {
        orderService.placeOrder(orderList);
    }
}
