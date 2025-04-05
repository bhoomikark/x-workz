package com.xworkz.lilyblossomstore.internal.toy;

public class Toy {
    public Toy() {
        System.out.println("Running Toy Constructor in Toy class");
    }

    public void play() {
        System.out.println("Parent class");
        System.out.println("Playing with the toy");
    }

    public void getMaterial() {
        System.out.println("Parent class");
        System.out.println("Checking toy material");
    }

    public void checkBattery() {
        System.out.println("Parent class");
        System.out.println("Checking toy battery");
    }

    public void move() {
        System.out.println("Parent class");
        System.out.println("Toy is moving");
    }

    public void getColor() {
        System.out.println("Parent class");
        System.out.println("Getting toy color");
    }
}
