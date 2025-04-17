package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fifityfive.*;

public class FiftyFiveRunner {
    public static void main(String[] args) {
        PaymentSystem p = new PayPal();
        p.initiatePayment();
        p.verifyPayment();
        p.completeTransaction();
    }
}
