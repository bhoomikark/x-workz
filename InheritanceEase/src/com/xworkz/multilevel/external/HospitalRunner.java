package com.xworkz.multilevel.external;

import com.xworkz.multilevel.internal.hospital.PatientDisease;

public class HospitalRunner {
    public static void main(String[] args) {
        PatientDisease obj = new PatientDisease();
        obj.display();
        obj.admit();
        obj.diagnose();
    }
}
