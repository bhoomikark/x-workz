package com.xworkz.swiggit.internal;

public class Staircase {
    private int noOfStairs;
    private boolean istyleApplied;
    private String typeOfStair;

    public Staircase(int noOfStairs, boolean istyleApplied, String typeOfStair) {
        this.noOfStairs = noOfStairs;
        this.istyleApplied = istyleApplied;
        this.typeOfStair = typeOfStair;
        System.out.println("2. Running Staircase Constructor");
    }

    @Override
    public String toString() {
        return "No of Stairs: " + noOfStairs + ", Is tyle Applied: " + istyleApplied +
                ", Type of Stair: " + typeOfStair;
    }
}
