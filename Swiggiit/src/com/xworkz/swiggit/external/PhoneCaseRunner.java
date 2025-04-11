package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.PhoneCase;

public class PhoneCaseRunner {
    public static void main(String[] args) {
        PhoneCase phoneCase = new PhoneCase("Silicone", "Black", true);
        System.out.println(phoneCase);
        System.out.println("Overridden HashCode: " + phoneCase.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(phoneCase));
    }
}
