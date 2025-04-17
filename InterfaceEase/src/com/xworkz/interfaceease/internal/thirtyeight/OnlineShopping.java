package com.xworkz.interfaceease.internal.thirtyeight;

public interface OnlineShopping {
    void addToCart();
    void makePayment();
    void trackOrder();
    default void viewHistory()
    {
        System.out.println("view History -- default");
    }
}
