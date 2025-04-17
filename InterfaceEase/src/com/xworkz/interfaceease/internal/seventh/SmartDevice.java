package com.xworkz.interfaceease.internal.seventh;

public class SmartDevice implements Printable,Scannable{
    @Override
    public void printText() {
        System.out.println("Printing text document...--smart device");
    }

    @Override
    public void printImage() {
        System.out.println("Printing image... -- smart device");
    }

    @Override
    public void scanDocument() {
        System.out.println("Running scan document -- Scanable -- class smart device");


    }

    @Override
    public void scanQRCode() {
        System.out.println("Running scan QRCode -- Scanable -- class smart device");


    }

    @Override
    public void scanBarcode() {
        System.out.println("Running scan barcode -- Scanable -- class smart device");

    }

    @Override
    public void printReport() {
        System.out.println("Printing report...-- smart device");

    }
}
