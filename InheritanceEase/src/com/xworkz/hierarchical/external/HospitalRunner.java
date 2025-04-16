package com.xworkz.hierarchical.external;

import com.xworkz.hierarchical.internal.hospital.Doctor;
import com.xworkz.hierarchical.internal.hospital.Patients;

public class HospitalRunner {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        d.info();
        d.treat();

        Patients p = new Patients();
        p.info();
        p.patientInfo();
    }
}
