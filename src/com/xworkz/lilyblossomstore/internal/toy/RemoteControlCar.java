package com.xworkz.lilyblossomstore.internal.toy;

public class RemoteControlCar extends Toy {
    public RemoteControlCar() {
        super();
        System.out.println("Running RemoteControlCar Constructor in RemoteControlCar class");
    }

    @Override
    public void play() {
        System.out.println("Child class");
        System.out.println("Controlling the remote control car during play.");
    }

    @Override
    public void getMaterial() {
        System.out.println("Child class");
        System.out.println("Remote control car is made of durable plastic.");
    }

    @Override
    public void checkBattery() {
        System.out.println("Child class");
        System.out.println("Checking the battery of the remote control car.");
    }

    @Override
    public void move() {
        System.out.println("Child class");
        System.out.println("Remote control car is moving forward and backward.");
    }

    @Override
    public void getColor() {
        System.out.println("Child class");
        System.out.println("Remote control car is red and black.");
    }
}
