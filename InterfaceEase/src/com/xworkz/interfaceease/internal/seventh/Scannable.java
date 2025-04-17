package com.xworkz.interfaceease.internal.seventh;

public interface Scannable {
    void scanDocument();
    void scanQRCode();
    void scanBarcode();
    default void scanTextbook()
    {
        System.out.println("Scan textbook -- default");
    }
}
