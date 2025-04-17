package com.xworkz.interfaceease.internal.fourtynine;

public class BarcodeScanner implements ScannerDevice {
    @Override
    public void initialize() {
        System.out.println("Barcode scanner initializing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning barcode...");
    }

    @Override
    public void shutdown() {
        System.out.println("Scanner shutting down.");
    }
}

