package com.xworkz.interfaceease.internal.tenth;

public interface Refundable {
    void initiateRefund();
    void verifyRefundEligibility();
    void processRefund();
    default void takeRefund() {
        System.out.println("take refund process...");
    }
}
