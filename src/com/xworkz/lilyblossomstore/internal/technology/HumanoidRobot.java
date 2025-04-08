package com.xworkz.lilyblossomstore.internal.technology;

public class HumanoidRobot extends Robot {
    public HumanoidRobot() {
        super();
        System.out.println("Child class");
        System.out.println("A humanoid robot mimics human behavior...");
    }

    @Override
    public void powerOn() {
        System.out.println("Child class");
        System.out.println("Humanoid robot is powering on with gestures...");
    }

    @Override
    public void performTask() {
        System.out.println("Child class");
        System.out.println("Humanoid robot is assisting with human-like tasks...");
    }

    @Override
    public void recharge() {
        System.out.println("Child class");
        System.out.println("Humanoid robot is docking for recharge...");
    }

    @Override
    public void communicate() {
        System.out.println("Child class");
        System.out.println("Humanoid robot is speaking and using facial expressions...");
    }

    @Override
    public void shutdown() {
        System.out.println("Child class");
        System.out.println("Humanoid robot is entering sleep mode...");
    }
    public void walkLikeHuman() {
        System.out.println("HumanoidRobot: Walking like a human.");
    }
}
