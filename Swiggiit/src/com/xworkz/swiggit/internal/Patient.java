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
}
