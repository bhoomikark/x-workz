package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.thirteen.*;

public class ThirteenthRunner {
    public static void main(String[] args) {
        Shape myShape = new Circle(5);
        myShape.draw();
        System.out.println("Area: " + myShape.calculateArea());
        System.out.println("Perimeter: " + myShape.calculatePerimeter());
    }
}
