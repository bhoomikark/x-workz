package com.xworkz.interfaceease.internal.fourtyseven;

public interface Painter {
    void sketch();
    void paint();
    void display();
    default void framePainting()
    {
        System.out.println("frame -- default");
    }
}
