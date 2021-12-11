package com.rms.controller;

import com.rms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    private @Autowired
    OrderService orderService;

    @GetMapping(name = "/cuisine/{cuisine}")
    public void placeOrderByCuisine(@PathVariable String cuisine) {
        orderService.placeOrderByCuisine(cuisine);
    }
}
