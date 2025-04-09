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
}
