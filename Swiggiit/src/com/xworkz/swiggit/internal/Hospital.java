
package com.xworkz.swiggit.internal;

public class Hospital {
    private String hospitalName;
    private int hospitalWards;
    private boolean isItMultispecialityHospitalOrNot;

    public Hospital(String hospitalName, int hospitalWards, boolean isItMultispecialityHospitalOrNot) {
        this.hospitalName = hospitalName;
        this.hospitalWards = hospitalWards;
        this.isItMultispecialityHospitalOrNot = isItMultispecialityHospitalOrNot;
        System.out.println("65. Running Hospital Constructor");
    }

    @Override
    public String toString() {
        return "Hospital Name: " + hospitalName +
                ", Wards: " + hospitalWards +
                ", Is Multispeciality: " + isItMultispecialityHospitalOrNot;
    }
    @Override
    public int hashCode() {
        System.out.println("Default HashCode: " + super.hashCode());
        return 456;
    }
}
