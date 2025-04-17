package com.xworkz.interfaceease.internal.fifityfive;

public interface PaymentSystem {
    void initiatePayment();
    void verifyPayment();
    void completeTransaction();
    default void withdraw()
    {
        System.out.println("Running withdraw");
    }
}
