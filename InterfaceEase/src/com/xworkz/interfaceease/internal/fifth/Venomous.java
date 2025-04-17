package com.xworkz.interfaceease.internal.fifth;

public interface Venomous {
    void bite();
    void injectVenom();
    default void venom()
    {
        System.out.println("Running venom");
    }
}