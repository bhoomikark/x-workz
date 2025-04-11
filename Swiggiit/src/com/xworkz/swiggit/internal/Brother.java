package com.xworkz.swiggit.internal;

public class Brother {
    private String brotherName;
    private int noOfElderSiblings;
    private String brotherEducation;

    public Brother(String brotherName, int noOfElderSiblings, String brotherEducation) {
        this.brotherName = brotherName;
        this.noOfElderSiblings = noOfElderSiblings;
        this.brotherEducation = brotherEducation;
        System.out.println("59. Running Brother Constructor");
    }

    @Override
    public String toString() {
        return "Brother Name: " + brotherName + ", Number of Elder Siblings: " + noOfElderSiblings + ", Education: " + brotherEducation;
    }
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 888;
    }
}
