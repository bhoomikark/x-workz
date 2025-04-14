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
    @Override
    public int hashCode() {
        return 107;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Staircase) {
                System.out.println("Staircase is reference of object");
                Staircase s1 = this;
                Staircase s2 = (Staircase) obj;


                if (s1.noOfStairs == s2.noOfStairs &&
                        s1.typeOfStair.equals(s2.typeOfStair)) {
                    System.out.println("Both Staircases are same (based on No of Stairs and Type)");
                    return true;
                }
            }
        }
        return false;
    }
}
