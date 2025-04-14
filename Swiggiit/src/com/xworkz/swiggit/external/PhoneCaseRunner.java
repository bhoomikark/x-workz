package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.PhoneCase;

public class PhoneCaseRunner {
    public static void main(String[] args) {
        PhoneCase case1= new PhoneCase("Silicone", "Black", true);
        System.out.println(case1);
        System.out.println("Overridden HashCode: " + case1.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(case1));
        PhoneCase case3 = new PhoneCase("Silicone", "Black", true);
        System.out.println("case1 equals case3? " + case1.equals(case3));
    }
}
