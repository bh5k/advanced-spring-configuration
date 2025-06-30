package com.example.piescopedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PieController {

    private final OrderIdGenerator orderIdGenerator;

    public PieController(OrderIdGenerator orderIdGenerator) {
        this.orderIdGenerator = orderIdGenerator;
    }

    @GetMapping("/order")
    public String getOrder() {
        return "Order ID: " + orderIdGenerator.getId();
    }
}
