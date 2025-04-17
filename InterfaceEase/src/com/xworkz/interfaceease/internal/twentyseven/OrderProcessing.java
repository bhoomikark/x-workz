package com.xworkz.interfaceease.internal.twentyseven;

public interface OrderProcessing {
    void placeOrder();
    void processOrder();
    void shipOrder();
    default void cancelOrder()
    {
        System.out.println("cancel order -- default");
    }
}
