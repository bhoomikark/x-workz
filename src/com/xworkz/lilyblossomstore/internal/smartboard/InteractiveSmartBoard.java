package com.xworkz.lilyblossomstore.internal.smartboard;

public class InteractiveSmartBoard extends SmartBoard {
    public InteractiveSmartBoard() {
        super();
        System.out.println("Running InteractiveSmartBoard Constructor in InteractiveSmartBoard class");
    }

    @Override
    public void display() {
        System.out.println("Child class");
        System.out.println("Displaying high-definition interactive content.");
    }

    @Override
    public void touchControl() {
        System.out.println("Child class");
        System.out.println("Multi-touch gestures supported for interaction.");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Child class");
        System.out.println("Auto-connects to cloud services via Wi-Fi.");
    }

    @Override
    public void writeWithStylus() {
        System.out.println("Child class");
        System.out.println("Stylus writing with real-time handwriting recognition.");
    }

    @Override
    public void recordSession() {
        System.out.println("Child class");
        System.out.println("Recording and saving interactive lessons to cloud.");
    }
}
