package com.xworkz.interfaceease.internal.twentynine;

public interface LibraryManagement {
    void borrowBook();
    void returnBook();
    void searchBook();
    default void viewSettings()
    {
        System.out.println("view settings -- default");
    }
}
