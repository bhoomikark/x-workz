package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.markscard.MarksCard;
import com.xworkz.lilyblossomstore.internal.markscard.StudentMarksCard;

public class MarksCardRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        MarksCard marksCard1 = new MarksCard();
        marksCard1.addSubject();
        marksCard1.enterMarks();
        marksCard1.calculatePercentage();
        marksCard1.printMarksCard();
        marksCard1.verifyMarks();

        System.out.println("Using parent type reference:");
        MarksCard marksCard = new StudentMarksCard();
        marksCard.addSubject();
        marksCard.enterMarks();
        marksCard.calculatePercentage();
        marksCard.printMarksCard();
        marksCard.verifyMarks();

        System.out.println("-----------");

        System.out.println("Using child type reference:");
        StudentMarksCard studentMarksCard = new StudentMarksCard();
        studentMarksCard.addSubject();
        studentMarksCard.enterMarks();
        studentMarksCard.calculatePercentage();
        studentMarksCard.printMarksCard();
        studentMarksCard.verifyMarks();
    }
}
