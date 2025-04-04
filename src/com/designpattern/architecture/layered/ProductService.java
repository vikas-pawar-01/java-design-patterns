package com.designpattern.architecture.layered;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductById(int productId) {
        return productRepository.findById(productId);
    }
}