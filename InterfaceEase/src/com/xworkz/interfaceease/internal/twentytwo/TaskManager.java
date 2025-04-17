package com.xworkz.interfaceease.internal.twentytwo;

public class TaskManager implements Task {
    @Override
    public void createTask() {
        System.out.println("Task created successfully.");
    }

    @Override
    public void markComplete() {
        System.out.println("Task marked as complete.");
    }

    @Override
    public void assignTask() {
        System.out.println("Task assigned to the team.");
    }
@Override
    public void completeTask()
    {
        System.out.println("complete task -- Task Manager");
    }
}