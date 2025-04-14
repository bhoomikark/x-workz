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

    @Override
    public int hashCode() {
        return 113;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Teacher) {
            Teacher teacher1 = this;
            Teacher teacher2 = (Teacher) obj;


            if (teacher1.teacherName.equals(teacher2.teacherName) && teacher1.teacherSubject.equals(teacher2.teacherSubject)) {
                return true;
            }
        }
        return false;
    }
}
