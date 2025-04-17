package com.xworkz.interfaceease.internal.seventh;

public class Printer implements Printable{
    @Override
    public void printText() {
        System.out.println("Printing text document...--Document printer");
    }

    @Override
    public void printImage() {
        System.out.println("Printing image... -- Document Printer");
    }
    @Override
    public void printReport() {
        System.out.println("Printing report...-- document printer");

    }
}
