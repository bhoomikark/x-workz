package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.ninth.BookReader;
import com.xworkz.interfaceease.internal.ninth.Editor;
import com.xworkz.interfaceease.internal.ninth.Readable;
import com.xworkz.interfaceease.internal.ninth.Writable;
import com.xworkz.interfaceease.internal.tenth.*;

public class TenthRunner {
    public static void main(String[] args) {
        System.out.println("Running Interface refundable  from return Request ");
        Refundable refundable=new ReturnRequest();
        refundable.initiateRefund();
        refundable.processRefund();
        refundable.verifyRefundEligibility();
        Payable payable2=new ReturnAmount();
        payable2.applyDiscount();
        payable2.generateInvoice();
        payable2.applyDiscount();
        System.out.println("=================================================");
        System.out.println("2 Copies from 2 subclasses");
        Refundable refundable1=new Transaction();
        refundable1.initiateRefund();
        refundable1.processRefund();
        refundable1.verifyRefundEligibility();
        Payable payable=new Transaction();
        payable.applyDiscount();
        payable.generateInvoice();
        payable.applyDiscount();
        Refundable refundable2=new Invoice();
        refundable2.initiateRefund();
        refundable2.processRefund();
        refundable2.verifyRefundEligibility();
        Payable payable1=new Invoice();
        payable1.applyDiscount();
        payable1.generateInvoice();
        payable1.applyDiscount();

    }
}
