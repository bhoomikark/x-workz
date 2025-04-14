package com.xworkz.swiggit.internal;

public class Patient {
    private String patientName;
    private int patientNo;
    private String patientIllness;

    public Patient(String patientName, int patientNo, String patientIllness) {
        this.patientName = patientName;
        this.patientNo = patientNo;
        this.patientIllness = patientIllness;
        System.out.println("66. Running Patient Constructor");
    }

    @Override
    public String toString() {
        return "Patient Name: " + patientName +
                ", Patient No: " + patientNo +
                ", Illness: " + patientIllness;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 505;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Patient) {
                System.out.println("Patient is reference of Object");
                Patient p1 = this;
                Patient p2 = (Patient) obj;
                if (p1.patientNo == p2.patientNo &&
                        p1.patientName.equals(p2.patientName) &&
                        p1.patientIllness.equals(p2.patientIllness)) {
                    System.out.println("Both Patient objects are equal");
                    return true;
                }
            }
        }
        return false;
    }
}
