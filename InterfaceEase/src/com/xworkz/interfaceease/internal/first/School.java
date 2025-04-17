package com.xworkz.interfaceease.internal.first;

public interface School {
    void Open();
    void Close();
    void Work();
    default void homeWork()
    {
        System.out.println("Home work");
    }
}
