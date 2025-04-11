package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Apollo", 12, true);
        System.out.println(hospital);
        System.out.println("Overridden HashCode: " + hospital.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(hospital));
    }
}
