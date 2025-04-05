package com.xworkz.lilyblossomstore.internal.medical;

public class Surgeon extends Doctor {
    public Surgeon() {
        super();
        System.out.println("Surgeon is specialized in performing surgeries... - Child class");
    }

    @Override
    public void diagnose() {
        System.out.println("Doctor is diagnosing the patient... - Child class");
    }

    @Override
    public void prescribeMedicine() {
        System.out.println("Doctor is prescribing medicine... - Child class");
    }

    @Override
    public void performCheckup() {
        System.out.println("Doctor is performing a general checkup... - Child class");
    }

    @Override
    public void giveAdvice() {
        System.out.println("Doctor is advising the patient... - Child class");
    }

    @Override
    public void reviewTests() {
        System.out.println("Doctor is reviewing test reports... - Child class");
    }
}
