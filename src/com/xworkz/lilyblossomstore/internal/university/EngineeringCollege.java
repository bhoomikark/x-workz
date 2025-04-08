package com.xworkz.lilyblossomstore.internal.university;

public class EngineeringCollege extends University {
    public EngineeringCollege() {
        super();
        System.out.println("Running EngineeringCollege Constructor");
    }

    @Override
    public void offerCourses() {
        System.out.println("Child class");
        System.out.println("Offering B.Tech and M.Tech courses...");
    }

    @Override
    public void conductExams() {
        System.out.println("Child class");
        System.out.println("Conducting semester exams for engineering students...");
    }

    @Override
    public void hostEvents() {
        System.out.println("Child class");
        System.out.println("Hosting technical and cultural events...");
    }

    @Override
    public void provideScholarships() {
        System.out.println("Child class");
        System.out.println("Providing scholarships for meritorious students...");
    }

    @Override
    public void researchPrograms() {
        System.out.println("Child class");
        System.out.println("Running engineering research programs...");
    }
    public void specializationStreams() {
        System.out.println("Child Class");
        System.out.println("Specialization in CS, EC, ME, Civil, and more...");
    }
}
