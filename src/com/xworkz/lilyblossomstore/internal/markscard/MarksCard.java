package com.xworkz.lilyblossomstore.internal.markscard;

public class MarksCard {
    public MarksCard() {
        System.out.println("Running MarksCard Constructor in MarksCard class - Parent class");
    }

    public void addSubject() {
        System.out.println("Adding subjects to MarksCard. - Parent class");
    }

    public void enterMarks() {
        System.out.println("Entering marks for subjects. - Parent class");
    }

    public void calculatePercentage() {
        System.out.println("Calculating student's percentage. - Parent class");
    }

    public void printMarksCard() {
        System.out.println("Printing MarksCard. - Parent class");
    }

    public void verifyMarks() {
        System.out.println("Verifying marks entered. - Parent class");
    }
}
