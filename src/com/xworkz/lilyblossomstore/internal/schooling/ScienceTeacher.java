package com.xworkz.lilyblossomstore.internal.schooling;

public class ScienceTeacher {
    public void teacherName(Teacher teacher) {
        System.out.println("\nInside ScienceTeacher class - Observing teacher behavior...");

        teacher.teach();
        teacher.gradePapers();
        teacher.prepareLesson();
        teacher.conductExam();
        teacher.guideStudents();

        if (teacher instanceof MathTeacher) {
            System.out.println("Casting Teacher to MathTeacher to access subject-specific behavior...");
            MathTeacher math = (MathTeacher) teacher;
            math.solveEquation();
        }
    }
}
