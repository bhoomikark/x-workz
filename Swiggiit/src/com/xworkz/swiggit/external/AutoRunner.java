package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Auto;

public class AutoRunner {
    public static void main(String[] args) {
        Auto auto = new Auto("Mahindra", true, "Green");
        System.out.println("Auto to string: " + auto.toString());

        System.out.println("Auto: "+auto.hashCode());
        System.out.println("Original value: "+System.identityHashCode(auto));

        Auto auto1=new Auto("Tata",false, "Yellow");
        Auto auto2=new Auto("Tesla", true, "Black");
        System.out.println("Are at same location or not: "+(auto1==auto2));
        boolean value=auto2.equals(auto1);
        System.out.println(value);

    }
}
