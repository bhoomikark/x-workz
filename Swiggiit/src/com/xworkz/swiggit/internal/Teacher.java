package com.xworkz.swiggit.internal;

public class Teacher {
    private double teacherSalary;
    private String teacherName;
    private String teacherSubject;

    public Teacher(double teacherSalary, String teacherName, String teacherSubject) {
        this.teacherSalary = teacherSalary;
        this.teacherName = teacherName;
        this.teacherSubject = teacherSubject;
        System.out.println("8. Running Teacher Constructor");
    }

    @Override
    public String toString() {
        return "Teacher Name: " + teacherName + ", Teacher Salary: " + teacherSalary +
                ", Teacher Subject: " + teacherSubject;
    }
}
