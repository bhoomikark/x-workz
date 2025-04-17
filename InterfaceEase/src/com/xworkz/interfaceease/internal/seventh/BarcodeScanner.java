package com.xworkz.interfaceease.internal.seventh;

public class BarcodeScanner implements  Scannable{
    @Override
    public void scanDocument() {
        System.out.println("Running scan document -- Scanable -- class barcodeScanner");

    }

    @Override
    public void scanQRCode() {
        System.out.println("Running scan QR Code -- Scanable -- class barcodeScanner");

    }

    @Override
    public void scanBarcode() {
        System.out.println("Running scan barcode -- Scanable -- class barcodeScanner");
    }
    @Override
    public void scanTextbook()
    {
        System.out.println("Scan textbook -- barcode scanner");
    }
}