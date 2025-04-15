package com.xworkz.multilevel.internal.dentist;

public class DentistPatients extends Dentist {
    public String patientName = "Ravi";
    public void treat() {
        System.out.println("Treating patient: " + patientName);
    }
}