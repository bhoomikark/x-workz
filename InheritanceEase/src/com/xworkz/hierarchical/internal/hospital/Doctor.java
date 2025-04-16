package com.xworkz.hierarchical.internal.hospital;

public class Doctor extends Hospital {
    public String specialization = "Cardiologist";
    public void treat() {
        System.out.println("Doctor Specialization: " + specialization);
    }
}