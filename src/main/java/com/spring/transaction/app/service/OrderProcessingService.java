package com.spring.transaction.app.service;

import com.spring.transaction.app.entity.Order;
import com.spring.transaction.app.entity.Product;
import com.spring.transaction.app.exception.ProductNotFoundException;
import com.spring.transaction.app.handler.InventoryHandler;
import com.spring.transaction.app.handler.OrderHandler;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class OrderProcessingService {

    @Autowired
    private OrderHandler orderHandler;

    @Autowired
    private InventoryHandler inventoryHandler;

    //Step 1:- get product inventory
    //Step 2:- validate stock avaliability
    //Step 3:- update total price in order entity
    //Step 4:- save order
    //Step 5:- update stock in inventory


    //REQUIRED:- join an existing transaction or create a new one if not exist
    //REQUIRED_NEW:- always create new transaction by suspending the previous transaction if exists any.
    @Transactional(propagation = Propagation.REQUIRED)
    public Order placeAnOrder(Order order)
    {
        Product productById = inventoryHandler.getProductById(order.getProductId());
        if(productById.getStock()<order.getQuantity())throw new ProductNotFoundException("Product with given quantity is not avaliable");

        orderTotalPrice(order, productById);
        saveOrder(order);
        updateInventoryStock(order, productById);

        //REQUIRED_NEW
        auditOrderDetails(order);
        return order;
    }

    private static void orderTotalPrice(Order order, Product productById) {
        order.setTotalPrice(order.getQuantity()* productById.getPrice());
    }

    private void saveOrder(Order order) {
        Order savedOrder = orderHandler.saveOrder(order);
    }

    private void updateInventoryStock(Order order, Product productById) {
        productById.setStock(productById.getStock()- order.getQuantity());
        inventoryHandler.updateProduct(productById);
    }

}
