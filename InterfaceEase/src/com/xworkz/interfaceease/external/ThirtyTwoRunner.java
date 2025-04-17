package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.thirtytwo.*;

public class ThirtyTwoRunner {
    public static void main(String[] args) {
        FoodDelivery foodDelivery = new OnlineFoodDelivery();
        foodDelivery.orderFood();
        foodDelivery.trackDelivery();
        foodDelivery.rateService();
    }
}
