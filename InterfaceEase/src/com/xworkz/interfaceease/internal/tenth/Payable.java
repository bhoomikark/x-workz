package com.xworkz.interfaceease.internal.tenth;

public interface Payable {
    void processPayment();
    void generateInvoice();
    void applyDiscount();
    default void initiateTransaction() {
        System.out.println("Initiating transaction...");
    }
}
