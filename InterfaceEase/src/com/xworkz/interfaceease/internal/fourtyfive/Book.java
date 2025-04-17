package com.xworkz.interfaceease.internal.fourtyfive;

public interface Book {
    void open();
    void read();
    void close();
    default void write()
    {
        System.out.println("write notes -- default");
    }
}
