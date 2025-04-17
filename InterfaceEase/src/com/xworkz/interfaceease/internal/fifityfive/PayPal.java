package com.xworkz.interfaceease.internal.fifityfive;

public class PayPal implements PaymentSystem {
    @Override
    public void initiatePayment() {
        System.out.println("Initiating PayPal payment...");
    }

    @Override
    public void verifyPayment() {
        System.out.println("Verifying payment...");
    }

    @Override
    public void completeTransaction() {
        System.out.println("Transaction complete.");
    }
}
