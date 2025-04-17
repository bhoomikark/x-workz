package com.xworkz.interfaceease.internal.thirtytwo;

public interface FoodDelivery {
    void orderFood();
    void trackDelivery();
    void rateService();
    default void onNotification()
    {
        System.out.println("on notification -- default");
    }
}
