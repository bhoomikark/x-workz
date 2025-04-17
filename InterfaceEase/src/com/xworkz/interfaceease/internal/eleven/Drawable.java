package com.xworkz.interfaceease.internal.eleven;

public interface Drawable {
    void drawShape();
    void fillColor();
    void setLineStyle();
    default void paint()
    {
        System.out.println("Running paint");
    }
}
