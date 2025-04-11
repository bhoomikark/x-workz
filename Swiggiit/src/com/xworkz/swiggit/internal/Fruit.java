package com.xworkz.swiggit.internal;

public class Fruit {
    private String fruitName;
    private int fruitNo;
    private boolean fruitIsRottenOrNot;

    public Fruit(String fruitName, int fruitNo, boolean fruitIsRottenOrNot) {
        this.fruitName = fruitName;
        this.fruitNo = fruitNo;
        this.fruitIsRottenOrNot = fruitIsRottenOrNot;
        System.out.println("43. Running Fruit Constructor");
    }

    @Override
    public String toString() {
        return "Fruit Name: " + fruitName + ", Quantity: " + fruitNo + ", Is Rotten: " + fruitIsRottenOrNot;
    }

    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 444;
    }
}
