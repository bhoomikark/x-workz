package com.xworkz.lilyblossomstore.internal.employee;

public class Manager extends Employee {
    public Manager() {
        super();
        System.out.println("Creating a Manager object...");
    }

    @Override
    public void work() {
        System.out.println("Child Class");
        System.out.println("Manager is managing team operations...");
    }

    @Override
    public void takeBreak() {
        System.out.println("Child Class");
        System.out.println("Manager is taking a break...");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Child Class");
        System.out.println("Manager is attending a leadership meeting...");
    }

    @Override
    public void receiveSalary() {
        System.out.println("Child Class");
        System.out.println("Manager is receiving salary with bonus...");
    }

    @Override
    public void applyLeave() {
        System.out.println("Child Class");
        System.out.println("Manager is applying for annual leave...");
    }
}
