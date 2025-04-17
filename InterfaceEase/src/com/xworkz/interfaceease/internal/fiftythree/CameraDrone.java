package com.xworkz.interfaceease.internal.fiftythree;

public class CameraDrone implements Drone {
    @Override
    public void launch() {
        System.out.println("Drone launching...");
    }

    @Override
    public void captureImage() {
        System.out.println("Capturing aerial image...");
    }

    @Override
    public void land() {
        System.out.println("Drone landing...");
    }
}
