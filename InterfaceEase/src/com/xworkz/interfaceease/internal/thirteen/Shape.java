package com.xworkz.interfaceease.internal.thirteen;

public interface Shape {
    void draw();
    double calculateArea();
    double calculatePerimeter();
    default void shapeOutlineColor()
    {
        System.out.println("outline color -- default");
    }
}
