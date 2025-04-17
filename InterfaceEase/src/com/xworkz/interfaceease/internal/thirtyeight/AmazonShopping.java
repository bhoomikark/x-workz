package com.xworkz.interfaceease.internal.thirtyeight;

public class AmazonShopping implements OnlineShopping {
    @Override
    public void addToCart() {
        System.out.println("Item added to cart on Amazon.");
    }

    @Override
    public void makePayment() {
        System.out.println("Payment done on Amazon.");
    }

    @Override
    public void trackOrder() {
        System.out.println("Tracking order on Amazon.");
    }
@Override
    public void viewHistory()
    {
        System.out.println("view History -- Amazon shopping");
    }
}
