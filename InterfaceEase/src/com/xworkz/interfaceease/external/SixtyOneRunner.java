package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.sixtyone.*;

public class SixtyOneRunner {
    public static void main(String[] args) {
        OnlineExam exam = new CodingTest();
        exam.startExam();
        exam.submitAnswer();
        exam.endExam();
        exam.think();
    }
}
