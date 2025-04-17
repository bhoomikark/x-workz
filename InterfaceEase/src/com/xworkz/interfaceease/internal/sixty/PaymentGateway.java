package com.xworkz.interfaceease.internal.sixty;

public interface PaymentGateway {
    void initiatePayment();
    void confirmPayment();
    void cancelPayment();
    default void checkHistory()
    {
        System.out.println("check history");
    }
}
