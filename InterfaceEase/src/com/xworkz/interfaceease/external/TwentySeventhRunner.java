package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.twentyseven.*;

public class TwentySeventhRunner {
    public static void main(String[] args) {
        OrderProcessing order = new ECommerceOrder();
        order.placeOrder();
        order.processOrder();
        order.shipOrder();
        order.cancelOrder();
    }
}
