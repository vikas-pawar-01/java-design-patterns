package com.designpattern.patterns.behavioral.strategy;

public class StrategyPatternDemo {
    public static void run() {
        PaymentContext paymentContext = new PaymentContext();

        // Pay using Credit Card
        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        paymentContext.pay(100.0);

        // Pay using PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment("user@example.com"));
        paymentContext.pay(200.0);

        // Pay using Google Pay
        paymentContext.setPaymentStrategy(new GooglePayPayment("9876543210"));
        paymentContext.pay(300.0);
    }
}