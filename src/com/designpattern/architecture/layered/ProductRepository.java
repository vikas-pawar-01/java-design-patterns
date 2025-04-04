package com.designpattern.architecture.layered;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {
    private Map<Integer, Product> productDatabase = new HashMap<>();

    public ProductRepository() {
        // Simulate a database with some products
        productDatabase.put(1, new Product(1, "Laptop", 1200.00));
        productDatabase.put(2, new Product(2, "Smartphone", 800.00));
        productDatabase.put(3, new Product(3, "Headphones", 150.00));
    }

    public Product findById(int productId) {
        return productDatabase.get(productId);
    }
}