package com.xworkz.interfaceease.internal.eleven;

public class Window implements Resizable{
    @Override
    public void resizeWidth() {
        System.out.println("resize width -- resizable -- Window");
    }

    @Override
    public void resizeHeight() {
        System.out.println("resize height -- resizable -- Window");
    }

    @Override
    public void maintainAspectRatio() {
        System.out.println("maintain aspect ratio -- resizable -- Window");
    }
    @Override
    public void resizebreadth()
    {
        System.out.println("Running resize -- resizebreadth");
    }
}
