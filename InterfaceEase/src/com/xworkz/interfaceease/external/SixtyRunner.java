package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.sixty.*;

public class SixtyRunner {
    public static void main(String[] args) {
        PaymentGateway pg = new PayPal();
        pg.initiatePayment();
        pg.confirmPayment();
        pg.cancelPayment();
        pg.checkHistory();
    }
}
