
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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Hospital) {
                Hospital otherHospital = (Hospital) obj;
                if (this.hospitalName.equals(otherHospital.hospitalName) &&
                        this.hospitalWards == otherHospital.hospitalWards &&
                        this.isItMultispecialityHospitalOrNot == otherHospital.isItMultispecialityHospitalOrNot) {
                    System.out.println("Both Hospitals are the same");
                    return true;
                }
            }
        }
        return false;
    }
}
