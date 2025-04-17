package com.xworkz.interfaceease.internal.tenth;

public class Transaction implements Payable,Refundable{
    @Override
    public void processPayment() {
        System.out.println("process payment -- payable-- Transaction");
    }

    @Override
    public void generateInvoice() {
        System.out.println("generate invoice -- payable-- Transaction");
    }

    @Override
    public void applyDiscount() {
        System.out.println("apply discount -- payable-- Transaction");
    }

    @Override
    public void initiateRefund() {
        System.out.println("initiate refund-- refundable-- Transaction");
    }

    @Override
    public void verifyRefundEligibility() {
        System.out.println("verify refund-- refundable--Transaction");
    }

    @Override
    public void processRefund() {
        System.out.println("process refund-- refundable--Transaction");
    }
}
