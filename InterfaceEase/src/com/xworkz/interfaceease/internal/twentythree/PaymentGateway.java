package com.xworkz.interfaceease.internal.twentythree;

public interface PaymentGateway {
    void initiatePayment();
    void processPayment();
    void completePayment();
}
