package com.designpattern.architecture.layered;

public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public void displayProductDetails(int productId) {
        Product product = productService.getProductById(productId);
        if (product != null) {
            System.out.println("Product Details:");
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: $" + product.getPrice());
        } else {
            System.out.println("Product not found.");
        }
    }
}