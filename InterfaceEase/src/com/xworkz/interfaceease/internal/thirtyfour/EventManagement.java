package com.xworkz.interfaceease.internal.thirtyfour;

public interface EventManagement {
    void planEvent();
    void executeEvent();
    void evaluateEvent();
    default void planParty()
    {
        System.out.println("Plan party -- default");
    }

}
