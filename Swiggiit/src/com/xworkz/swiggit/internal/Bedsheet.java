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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Not null");
            if (obj instanceof Bedsheet) {
                System.out.println("Bedsheet is reference of object");
                Bedsheet b1 = this;
                Bedsheet b2 = (Bedsheet) obj;
                if (b1.bedsheetColor.equals(b2.bedsheetColor)) {
                    System.out.println("Both bedsheets are of the same color");
                    return true;
                }
            }
        }
        return false;
    }
}
