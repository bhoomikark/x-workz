package com.xworkz.interfaceease.internal.seventh;

public class DocumentPrinter implements Printable,Scannable {
    @Override
    public void printText() {
        System.out.println("Printing text document...--Document printer");
    }

    @Override
    public void printImage() {
        System.out.println("Printing image... -- Document Printer");
    }

    @Override
    public void scanDocument() {
        System.out.println("Running scan document -- Scanable -- class DocumentPrinter");


    }

    @Override
    public void scanQRCode() {
        System.out.println("Running scan QRCode -- Scanable -- class DocumentPrinter");


    }

    @Override
    public void scanBarcode() {
        System.out.println("Running scan barcode -- Scanable -- class DocumentPrinter");

    }

    @Override
    public void printReport() {
        System.out.println("Printing report...-- document printer");

    }
    @Override
    public void colorPrint()
    {
        System.out.println("color print -- document printer");
    }
}