package com.xworkz.interfaceease.internal.eleven;

public class Sketch implements  Drawable{

    @Override
    public void drawShape() {
        System.out.println("draw shape -- drawable -- sketch");
    }

    @Override
    public void fillColor() {
        System.out.println("fill color -- drawable -- sketch");
    }

    @Override
    public void setLineStyle() {
        System.out.println("setline style -- drawable -- sketch");
    }
}
