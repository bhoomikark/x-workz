package com.xworkz.late.internal.ttpackage;

public class ReviewImpl implements Review {
    public ReviewImpl() {
        super();
        System.out.println("No-arg constructor of ReviewImpl");
    }

    @Override
    public void writeReview() {
        System.out.println("Overriding Review - Writing review");
    }
}
