package com.xworkz.lilyblossomstore.internal.markscard;

public class StudentMarksCard extends MarksCard {
    public StudentMarksCard() {
        super();
        System.out.println("Running StudentMarksCard Constructor in StudentMarksCard class - Child class");
    }

    @Override
    public void addSubject() {
        System.out.println("Adding subjects to MarksCard. - Child class");
    }

    @Override
    public void enterMarks() {
        System.out.println("Entering marks for subjects. - Child class");
    }

    @Override
    public void calculatePercentage() {
        System.out.println("Calculating student's percentage. - Child class");
    }

    @Override
    public void printMarksCard() {
        System.out.println("Printing MarksCard. - Child class");
    }

    @Override
    public void verifyMarks() {
        System.out.println("Verifying marks entered. - Child class");
    }
}
