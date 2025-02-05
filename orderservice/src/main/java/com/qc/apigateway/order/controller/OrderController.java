package com.qc.apigateway.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qc.apigateway.order.entity.Orders;
import com.qc.apigateway.order.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/allorders")
    public List<Orders> getOrders() {
        return orderService.getAllOrders();
    }
      
        // Search order by ID
        @GetMapping("/{id}")
        public Orders getOrderById(@PathVariable Integer id) {
            return orderService.getOrderById(id).get();
        }
            @PostMapping("/save")
            public Orders saveOrderDetails(@RequestBody Orders order) {
                return orderService. saveOrderDetails(order);
    }

}