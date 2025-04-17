package com.xworkz.interfaceease.internal.twentytwo;

public interface Task {
    void createTask();
    void markComplete();
    void assignTask();
    default void completeTask()
    {
        System.out.println("complete task -- default");
    }
}
