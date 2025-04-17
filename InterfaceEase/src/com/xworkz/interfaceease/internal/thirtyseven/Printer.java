package com.xworkz.interfaceease.internal.thirtyseven;

public interface Printer {
    void startPrint();
    void cancelPrint();
    void finishPrint();
    default void print()
    {
        System.out.println("print -- default");
    }
}
