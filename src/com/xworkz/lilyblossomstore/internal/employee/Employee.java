package com.xworkz.lilyblossomstore.internal.employee;

public class Employee {

    public Employee() {
        System.out.println("Running Employee Constructor in Employee class");
    }

    public void work() {
        System.out.println("Parent Class");
        System.out.println("Employee is working...");
    }

    public void takeBreak() {
        System.out.println("Parent Class");
        System.out.println("Employee is taking a break...");
    }

    public void attendMeeting() {
        System.out.println("Parent Class");
        System.out.println("Employee is attending a meeting...");
    }

    public void receiveSalary() {
        System.out.println("Parent Class");
        System.out.println("Employee is receiving salary...");
    }

    public void applyLeave() {
        System.out.println("Parent Class");
        System.out.println("Employee is applying for leave...");
    }
}
