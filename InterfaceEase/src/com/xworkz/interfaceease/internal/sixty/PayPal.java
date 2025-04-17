package com.xworkz.interfaceease.internal.sixty;

public class PayPal implements PaymentGateway {
    @Override
    public void initiatePayment() {
        System.out.println("Payment initiated via PayPal.");
    }

    @Override
    public void confirmPayment() {
        System.out.println("Payment confirmed.");
    }

    @Override
    public void cancelPayment() {
        System.out.println("Payment canceled.");
    }
    @Override
    public void checkHistory()
    {
        System.out.println("check history -- paypal");
    }
}
