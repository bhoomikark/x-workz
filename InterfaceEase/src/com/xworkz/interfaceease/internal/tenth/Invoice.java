package com.xworkz.interfaceease.internal.tenth;

public class Invoice implements Payable,Refundable{
    @Override
    public void processPayment() {
        System.out.println("process payment -- payable--invoice");
    }

    @Override
    public void generateInvoice() {
        System.out.println("generate invoice -- payable--invoice");
    }

    @Override
    public void applyDiscount() {
        System.out.println("apply discount -- payable--invoice");
    }

    @Override
    public void initiateRefund() {
        System.out.println("initiate refund-- refundable--invoice");
    }

    @Override
    public void verifyRefundEligibility() {
        System.out.println("verify refund-- refundable--invoice");
    }

    @Override
    public void processRefund() {
        System.out.println("process refund-- refundable--invoice");
    }
}
