package com.xworkz.interfaceease.internal.fiftyone;

public class PhilipsHue implements SmartLight {
    @Override
    public void connect() {
        System.out.println("Connected to Philips Hue.");
    }

    @Override
    public void turnOnLight() {
        System.out.println("Light turned ON.");
    }

    @Override
    public void turnOffLight() {
        System.out.println("Light turned OFF.");
    }
@Override
    public void automatic()
    {
        System.out.println("Running automatic");
    }
}
