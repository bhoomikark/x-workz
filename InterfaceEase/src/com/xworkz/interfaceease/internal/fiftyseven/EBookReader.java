package com.xworkz.interfaceease.internal.fiftyseven;

public interface EBookReader {
    void openBook();
    void readPage();
    void closeBook();
    default void countPage()
    {
        System.out.println("Running count page");
    }
}
