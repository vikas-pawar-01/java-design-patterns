package com.designpattern.architecture.microservices;

public class MicroservicesArchitectureDemo {
    public static void run() {
        // Initialize services
        ProductService productService = new ProductService();
        OrderService orderService = new OrderService(productService);
        PaymentService paymentService = new PaymentService();
        NotificationService notificationService = new NotificationService();

        // Place an order
        int productId = 1;
        int quantity = 2;
        orderService.placeOrder(productId, quantity);

        // Process payment
        String orderDetails = quantity + " x " + productService.getProductById(productId);
        paymentService.processPayment(orderDetails, 2400.00);

        // Send notification
        notificationService.sendNotification("Your order for " + orderDetails + " has been placed successfully!");
    }
}