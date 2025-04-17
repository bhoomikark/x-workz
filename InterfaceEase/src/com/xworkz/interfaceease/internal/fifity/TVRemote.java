package com.xworkz.interfaceease.internal.fifity;

public class TVRemote implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("TV turned on.");
    }

    @Override
    public void changeChannel() {
        System.out.println("Channel changed.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turned off.");
    }
@Override
    public void pressButton()
    {
        System.out.println("Running press button -- pressbutton");
    }
}
