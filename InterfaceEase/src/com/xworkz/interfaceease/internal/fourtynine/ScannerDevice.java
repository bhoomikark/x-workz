package com.xworkz.interfaceease.internal.fourtynine;

public interface ScannerDevice {
    void initialize();
    void scan();
    void shutdown();
    default void operatebutton()
    {
        System.out.println("operating buttons -- default");
    }
}
