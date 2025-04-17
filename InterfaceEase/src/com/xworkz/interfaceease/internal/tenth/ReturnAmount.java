package com.xworkz.interfaceease.internal.tenth;

public class ReturnAmount implements Payable{
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
}
