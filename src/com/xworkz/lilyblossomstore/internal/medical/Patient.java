package com.xworkz.lilyblossomstore.internal.medical;

public class Patient {
    public void noOfPatients() {
        System.out.println("Tracking number of patients visiting the hospital.");
    }

    public void consultDoctor(Doctor doctor) {
        System.out.println("\nConsulting a doctor...");

        doctor.diagnose();
        doctor.prescribeMedicine();
        doctor.performCheckup();
        doctor.giveAdvice();
        doctor.reviewTests();

        if (doctor instanceof Surgeon) {
            System.out.println("Doctor is actually a surgeon. Casting and performing surgery...");
            Surgeon surgeon = (Surgeon) doctor;
            surgeon.performSurgery();
        }
    }
}
