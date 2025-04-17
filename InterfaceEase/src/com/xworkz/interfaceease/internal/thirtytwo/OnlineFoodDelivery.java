package com.xworkz.interfaceease.internal.thirtytwo;

public class OnlineFoodDelivery implements FoodDelivery {
    @Override
    public void orderFood() {
        System.out.println("Ordering food online.");
    }

    @Override
    public void trackDelivery() {
        System.out.println("Tracking food delivery.");
    }

    @Override
    public void rateService() {
        System.out.println("Rating the food delivery service.");
    }
}
