package com.designpattern.architecture.microservices;

public class OrderService {
    private ProductService productService;

    public OrderService(ProductService productService) {
        this.productService = productService;
    }

    public void placeOrder(int productId, int quantity) {
        String product = productService.getProductById(productId);
        if (!product.equals("Product not found")) {
            System.out.println("Order placed: " + quantity + " x " + product);
        } else {
            System.out.println("Order failed: Product not found");
        }
    }
}