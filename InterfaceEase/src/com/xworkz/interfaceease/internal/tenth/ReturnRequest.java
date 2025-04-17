package com.xworkz.interfaceease.internal.tenth;

public class ReturnRequest implements Refundable{
    @Override
    public void initiateRefund() {
        System.out.println("initiate refund-- refundable-- Return request");
    }

    @Override
    public void verifyRefundEligibility() {
        System.out.println("verify refund-- refundable-- return request");
    }

    @Override
    public void processRefund() {
        System.out.println("process refund-- refundable-- return request");
    }
@Override
    public void takeRefund() {
        System.out.println("take refund process... -- return request");
    }
}
