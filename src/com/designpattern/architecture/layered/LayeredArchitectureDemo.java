package com.designpattern.architecture.layered;

public class LayeredArchitectureDemo {
    public static void run() {
        ProductRepository productRepository = new ProductRepository();
        ProductService productService = new ProductService(productRepository);
        ProductController productController = new ProductController(productService);

        // Display product details
        productController.displayProductDetails(1); // Laptop
        productController.displayProductDetails(2); // Smartphone
        productController.displayProductDetails(4); // Not found
    }
}