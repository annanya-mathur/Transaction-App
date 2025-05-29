package com.spring.transaction.app.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PRODUCTS")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Product ID")
    private int productId;
    @Column(name = "Product Name")
    private String name;
    @Column(name = "Product Price")
    private double price;
    @Column(name = "Stock Quantity")
    private int stock;

}
