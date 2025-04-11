package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.JeansPant;

public class JeansPantRunner {
    public static void main(String[] args) {
        JeansPant jeans = new JeansPant("Slim Fit", "Denim", "Navy Blue");
        System.out.println(jeans);
        System.out.println("Overridden HashCode: " + jeans.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(jeans));
    }
}
