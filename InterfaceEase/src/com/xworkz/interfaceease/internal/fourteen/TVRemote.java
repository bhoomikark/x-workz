package com.xworkz.interfaceease.internal.fourteen;

public class TVRemote implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("TV is turned ON.");
    }
    @Override
    public void changeChannel() {
        System.out.println("TV channel changed.");
    }
    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}
