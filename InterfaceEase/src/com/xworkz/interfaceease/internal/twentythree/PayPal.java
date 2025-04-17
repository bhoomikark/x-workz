package com.xworkz.interfaceease.internal.twentythree;

public class PayPal  implements PaymentGateway {
    @Override
    public void initiatePayment() {
        System.out.println("Initiating PayPal payment.");
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment.");
    }

    @Override
    public void completePayment() {
        System.out.println("Payment completed using PayPal.");
    }
@Override
    public void pay()
    {
        System.out.println("pay -- Paypal");
    }
}

