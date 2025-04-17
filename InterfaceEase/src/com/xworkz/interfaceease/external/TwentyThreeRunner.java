package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.twentythree.*;

public class TwentyThreeRunner {
    public static void main(String[] args) {
        PaymentGateway pg = new PayPal();
        pg.initiatePayment();
        pg.processPayment();
        pg.completePayment();
    }
}
