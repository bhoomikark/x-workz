package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.thirtyseven.*;

public class ThirtySevenRunner {
    public static void main(String[] args) {
        Printer printer = new LaserPrinter();
        printer.startPrint();
        printer.cancelPrint();
        printer.finishPrint();
        printer.print();
    }
}
