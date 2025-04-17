package com.xworkz.interfaceease.internal.sixtyone;

public class CodingTest implements OnlineExam {
    @Override
    public void startExam() {
        System.out.println("Coding exam started.");
    }

    @Override
    public void submitAnswer() {
        System.out.println("Answer submitted.");
    }

    @Override
    public void endExam() {
        System.out.println("Coding exam ended.");
    }
}
