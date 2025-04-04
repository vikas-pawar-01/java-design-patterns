package com.designpattern.architecture.microservices;

public class PaymentService {
    public void processPayment(String orderDetails, double amount) {
        System.out.println("Processing payment of $" + amount + " for order: " + orderDetails);
    }
}