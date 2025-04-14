package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.JeansPant;

public class JeansPantRunner {
    public static void main(String[] args) {
        JeansPant jeans = new JeansPant("Slim Fit", "Denim", "Navy Blue");
        System.out.println(jeans);
        System.out.println("Overridden HashCode: " + jeans.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(jeans));
        JeansPant jeans1 = new JeansPant("Slim Fit", "Denim", "Navy Blue");
        JeansPant jeans2 = new JeansPant("Slim Fit", "Denim", "Navy Blue");
        JeansPant jeans3 = new JeansPant("Regular Fit", "Cotton", "Black");
        System.out.println("Are Jeans Pant 1 and Jeans Pant 2 equal? " + jeans1.equals(jeans2));
        System.out.println("Are Jeans Pant 1 and Jeans Pant 3 equal? " + jeans1.equals(jeans3));
    }
}
