package com.spring.transaction.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="ORDERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Order ID")
    private int orderID;
    @Column(name = "Product ID")
    private int productId;
    @Column(name = "Quantity")
    private int quantity;
    @Column(name = "Total Price")
    private double totalPrice;


}
