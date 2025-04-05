package com.xworkz.lilyblossomstore.internal.technology;

public class Robot {
    public Robot() {
        System.out.println("Parent class");
        System.out.println("A robot is a machine that performs tasks...");
    }

    public void powerOn() {
        System.out.println("Parent class");
        System.out.println("Robot is powering on...");
    }

    public void performTask() {
        System.out.println("Parent class");
        System.out.println("Robot is performing a programmed task...");
    }

    public void recharge() {
        System.out.println("Parent class");
        System.out.println("Robot is recharging its battery...");
    }

    public void communicate() {
        System.out.println("Parent class");
        System.out.println("Robot is communicating using signals...");
    }

    public void shutdown() {
        System.out.println("Parent class");
        System.out.println("Robot is shutting down...");
    }
}
