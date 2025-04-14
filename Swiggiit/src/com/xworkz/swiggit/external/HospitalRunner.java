package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Apollo", 12, true);
        System.out.println(hospital);
        System.out.println("Overridden HashCode: " + hospital.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(hospital));
        Hospital hospital1 = new Hospital("Apollo", 12, true);
        Hospital hospital2 = new Hospital("Apollo", 12, true);
        Hospital hospital3 = new Hospital("Max", 10, false);
        System.out.println("Are Hospital1 and Hospital2 equal? " + hospital1.equals(hospital2));
        System.out.println("Are Hospital1 and Hospital3 equal? " + hospital1.equals(hospital3));
    }
}
