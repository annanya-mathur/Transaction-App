package com.spring.transaction.app.controller;

import com.spring.transaction.app.entity.Order;
import com.spring.transaction.app.service.OrderProcessingService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/order")
public class OrderProcessingController {

    @Autowired
    private OrderProcessingService orderProcessingService;


    @PostMapping
    public ResponseEntity<?>placeAnOrder(@RequestBody Order order)
    {
         return ResponseEntity.ok(orderProcessingService.placeAnOrder(order));
    }


}
