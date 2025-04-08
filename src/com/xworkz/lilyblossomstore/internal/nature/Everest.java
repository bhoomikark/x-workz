package com.xworkz.lilyblossomstore.internal.nature;

public class Everest extends Mountain {
    public Everest() {
        super();
        System.out.println("Mount Everest is the tallest mountain... - Child class");
    }

    @Override
    public void getHeight() {
        System.out.println("Measuring mountain height... - Child class");
    }

    @Override
    public void isClimbable() {
        System.out.println("Checking if the mountain is climbable... - Child class");
    }

    @Override
    public void hasSnow() {
        System.out.println("Checking if the mountain has snow... - Child class");
    }

    @Override
    public void location() {
        System.out.println("Finding the mountain's location... - Child class");
    }

    @Override
    public void ecosystem() {
        System.out.println("Observing the mountain's ecosystem... - Child class");
    }
    public void summit() {
        System.out.println("Everest summit is one of the ultimate challenges.");
    }
}
