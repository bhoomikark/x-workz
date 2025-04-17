package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.thirtyeight.*;

public class ThirtyEighthRunner {
    public static void main(String[] args) {
        OnlineShopping shop = new AmazonShopping();
        shop.addToCart();
        shop.makePayment();
        shop.trackOrder();
    }
}
