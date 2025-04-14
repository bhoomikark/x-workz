package com.xworkz.swiggit.internal;

public class Paper {
    private String paperName;
    private String paperLanguage;
    private int noOfPaperBought;

    public Paper(String paperName, String paperLanguage, int noOfPaperBought) {
        this.paperName = paperName;
        this.paperLanguage = paperLanguage;
        this.noOfPaperBought = noOfPaperBought;
        System.out.println("7. Running Paper Constructor");
    }

    @Override
    public String toString() {
        return "Paper Name: " + paperName + ", Paper Language: " + paperLanguage +
                ", No of Paper Bought: " + noOfPaperBought;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 999;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Paper) {
                System.out.println("Paper is reference of Object");
                Paper p1 = this;
                Paper p2 = (Paper) obj;
                if (p1.paperName.equals(p2.paperName) &&
                        p1.paperLanguage.equals(p2.paperLanguage) &&
                        p1.noOfPaperBought == p2.noOfPaperBought) {
                    System.out.println("Both Paper objects are equal");
                    return true;
                }
            }
        }
        return false;
    }
}
