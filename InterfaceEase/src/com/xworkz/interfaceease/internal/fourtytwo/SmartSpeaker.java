package com.xworkz.interfaceease.internal.fourtytwo;

public class SmartSpeaker implements Speaker, Bluetooth {
    @Override
    public void playMusic() {
        System.out.println("Playing music on Smart Speaker...");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Volume increased.");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Volume decreased.");
    }

    @Override
    public void connect() {
        System.out.println("Bluetooth connected.");
    }

    @Override
    public void disconnect() {
        System.out.println("Bluetooth disconnected.");
    }

    @Override
    public void transferData() {
        System.out.println("Data transferred via Bluetooth.");
    }
}