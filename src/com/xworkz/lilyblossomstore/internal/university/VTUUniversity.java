package com.xworkz.lilyblossomstore.internal.university;

public class VTUUniversity {
    public void VTU(University university) {
        System.out.println("\nRunning VTU(University university)");
        System.out.println("======================================");
        university.offerCourses();
        university.conductExams();
        university.hostEvents();
        university.provideScholarships();
        university.researchPrograms();

        if (university instanceof EngineeringCollege) {
            System.out.println("Casting to EngineeringCollege...");
            EngineeringCollege engCollege = (EngineeringCollege) university;
            engCollege.specializationStreams();
        }
    }
}
