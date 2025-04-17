package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.seventh.*;

public class SeventhRunner {
    public static void main(String[] args) {
        System.out.println("1.Running interface scannable reference from barcodescanner class");
        Scannable scannable=new BarcodeScanner();
        scannable.scanBarcode();
        scannable.scanDocument();
        scannable.scanQRCode();
        Printable printable2=new Printer();
        printable2.printImage();
        printable2.printReport();
        printable2.printText();
        System.out.println("=================================");
        System.out.println("2 copies from 2 new Classes");
        Scannable scannable1=new DocumentPrinter();
        scannable1.scanBarcode();
        scannable1.scanDocument();
        scannable1.scanQRCode();
        Printable printable=new DocumentPrinter();
        printable.printImage();
        printable.printReport();
        printable.printText();
        Scannable scannable2=new SmartDevice();
        scannable2.scanBarcode();
        scannable2.scanDocument();
        scannable2.scanQRCode();
        Printable printable1=new SmartDevice();
        printable1.printImage();
        printable1.printReport();
        printable1.printText();

    }
}
