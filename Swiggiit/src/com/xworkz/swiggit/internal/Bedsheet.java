package com.xworkz.swiggit.internal;

public class Bedsheet {
    private String bedsheetColor;
    private int noOfBedsheet;
    private String bedsheetDesign;

    public Bedsheet(String bedsheetColor, int noOfBedsheet, String bedsheetDesign) {
        this.bedsheetColor = bedsheetColor;
        this.noOfBedsheet = noOfBedsheet;
        this.bedsheetDesign = bedsheetDesign;
        System.out.println("1. Running Bedsheet Constructor");
    }

    @Override
    public String toString() {
        return "Bedsheet Color is " + bedsheetColor + ", No of Bedsheets is " + noOfBedsheet +
                ", Bedsheet Design is " + bedsheetDesign;

    }

    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 333;
    }
}
