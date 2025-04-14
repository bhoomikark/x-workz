package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Patient;

public class PatientRunner {
    public static void main(String[] args) {
        Patient patient = new Patient("Rahul", 1023, "Flu");
        System.out.println(patient);
        System.out.println("Overridden HashCode: " + patient.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(patient));
        Patient patient1 = new Patient("Rahul", 1023, "Flu");
        Patient patient2 = new Patient("Aditi", 1024, "Cold");

        System.out.println("patient.equals(patient1)? " + patient.equals(patient1));
        System.out.println("patient.equals(patient2)? " + patient.equals(patient2));
    }
}
