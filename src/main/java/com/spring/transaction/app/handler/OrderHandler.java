package com.spring.transaction.app.handler;


import com.spring.transaction.app.entity.Order;
import com.spring.transaction.app.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class OrderHandler {

    @Autowired
    private OrderRepository orderRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    public Order saveOrder(Order order)
    {
        return orderRepository.save(order);
    }

}
