package com.xworkz.lilyblossomstore.internal.schooling;

public class MathTeacher extends Teacher {
    public MathTeacher() {
        super();
        System.out.println("MathTeacher teaches mathematics...");
    }

    @Override
    public void teach() {
        System.out.println("Child class");
        System.out.println("MathTeacher is teaching algebra and geometry...");
    }

    @Override
    public void gradePapers() {
        System.out.println("Child class");
        System.out.println("MathTeacher is grading math test papers...");
    }

    @Override
    public void prepareLesson() {
        System.out.println("Child class");
        System.out.println("MathTeacher is preparing math lesson plans...");
    }

    @Override
    public void conductExam() {
        System.out.println("Child class");
        System.out.println("MathTeacher is conducting math exams...");
    }

    @Override
    public void guideStudents() {
        System.out.println("Child class");
        System.out.println("MathTeacher is guiding students with problem solving...");
    }
    public void solveEquation() {
        System.out.println("MathTeacher is solving a complex equation.");
    }
}
