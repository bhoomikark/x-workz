package com.xworkz.interfaceease.internal.eleven;

public class Canvas implements Drawable,Resizable{
    @Override
    public void drawShape() {
        System.out.println("draw shape -- drawable -- Canvas");
    }

    @Override
    public void fillColor() {
        System.out.println("fill color -- drawable -- Canvas");
    }

    @Override
    public void setLineStyle() {
        System.out.println("setline style -- drawable -- Canvas");
    }

    @Override
    public void resizeWidth() {
        System.out.println("resize width -- resizable -- Canvas");
    }

    @Override
    public void resizeHeight() {
        System.out.println("resize height -- resizable -- Canvas");
    }

    @Override
    public void maintainAspectRatio() {
        System.out.println("maintain aspect ratio -- resizable -- Canvas");
    }
}
