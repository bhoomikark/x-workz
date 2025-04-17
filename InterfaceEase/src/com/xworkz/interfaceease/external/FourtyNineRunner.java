package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.fourtynine.*;

public class FourtyNineRunner {
    public static void main(String[] args) {
        ScannerDevice device = new BarcodeScanner();
        device.initialize();
        device.scan();
        device.shutdown();
        device.operatebutton();
    }}