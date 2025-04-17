package com.xworkz.interfaceease.external;

import com.xworkz.interfaceease.internal.twentytwo.*;

public class TwentyTwoRunner {
    public static void main(String[] args) {
        Task t = new TaskManager();
        t.createTask();
        t.markComplete();
        t.assignTask();
        t.completeTask();
    }
}
