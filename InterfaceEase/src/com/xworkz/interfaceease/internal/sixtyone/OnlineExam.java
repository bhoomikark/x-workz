package com.xworkz.interfaceease.internal.sixtyone;

public interface OnlineExam {
    void startExam();
    void submitAnswer();
    void endExam();
    default void think()
    {
        System.out.println("Think and write -- default");
    }
}
