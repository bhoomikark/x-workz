package com.xworkz.interfaceease.internal.seventh;

public interface Printable {
    void printText();
    void printImage();
    void printReport();
    default void colorPrint()
    {
        System.out.println("color print -- default");
    }
}
