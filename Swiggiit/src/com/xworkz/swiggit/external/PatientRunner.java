package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Patient;

public class PatientRunner {
    public static void main(String[] args) {
        Patient patient = new Patient("Rahul", 1023, "Flu");
        System.out.println(patient);
    }
}
