package com.xworkz.hierarchical.internal.iron;

public class Rack extends Iron {
    public int shelves = 4;
    public void display() {
        System.out.println("Rack has " + shelves + " shelves");
    }
}