package com.spring.transaction.app.service;

import com.spring.transaction.app.entity.Order;
import com.spring.transaction.app.handler.InventoryHandler;
import com.spring.transaction.app.handler.OrderHandler;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderProcessingService {

    @Autowired
    private OrderHandler orderHandler;

    @Autowired
    private InventoryHandler inventoryHandler;

//    //Step 1:- get product inventory
//    //Step 2:- validate stock avaliability
//    //Step 3:- update total price in order entity
//
//    public Order placeAnOrder(Order order)
//    {
//
//    }
}
