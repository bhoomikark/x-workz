package com.xworkz.interfaceease.internal.twentyseven;

public class ECommerceOrder implements OrderProcessing {
    @Override
    public void placeOrder() {
        System.out.println("Order placed successfully.");
    }

    @Override
    public void processOrder() {
        System.out.println("Processing the order.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Shipping the order.");
    }
@Override
    public void cancelOrder()
    {
        System.out.println("cancel order -- Ecommerce order ");
    }
}
