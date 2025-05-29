package com.spring.transaction.app.handler;

import com.spring.transaction.app.entity.Product;
import com.spring.transaction.app.exception.ProductNotFoundException;
import com.spring.transaction.app.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryHandler {

    @Autowired
    private InventoryRepository inventoryRepository;

    public Product updateProduct(Product product)
    {
        return inventoryRepository.save(product);
    }

    public Product getProductById(int productId)
    {
        return inventoryRepository.findById(productId).orElseThrow(()-> new ProductNotFoundException("Product with the given Id doesn't exist"));
    }
}
