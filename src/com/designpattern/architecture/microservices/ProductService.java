package com.designpattern.architecture.microservices;

import java.util.HashMap;
import java.util.Map;

public class ProductService {
    private Map<Integer, String> products = new HashMap<>();

    public ProductService() {
        products.put(1, "Laptop");
        products.put(2, "Smartphone");
        products.put(3, "Headphones");
    }

    public String getProductById(int productId) {
        return products.getOrDefault(productId, "Product not found");
    }
}