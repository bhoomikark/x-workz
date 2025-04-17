package com.xworkz.interfaceease.internal.tenth;

public class ReturnAmount implements Payable{
    @Override
    public void processPayment() {
        System.out.println("process payment -- payable--return amount");
    }

    @Override
    public void generateInvoice() {
        System.out.println("generate invoice -- payable--return amount");
    }

    @Override
    public void applyDiscount() {
        System.out.println("apply discount -- payable-- return amount");
    }
@Override
    public void initiateTransaction() {
        System.out.println("Initiating transaction... -- return amount");
    }
}
