package com.spring.transaction.app.repository;

import com.spring.transaction.app.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Product,Integer> {
}
