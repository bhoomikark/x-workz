package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Gmail;

public class GmailRunner {
    public static void main(String[] args) {
        Gmail gmail = new Gmail("rkofficial@gmail.com", "RK", true);
        System.out.println("Gmail to string: " + gmail.toString());
        System.out.println("Overridden HashCode: " + gmail.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(gmail));
        Gmail gmail1 = new Gmail("rkofficial@gmail.com", "RK", true);
        Gmail gmail2 = new Gmail("rkofficial@gmail.com", "RK", true);
        boolean isEqual = gmail1.equals(gmail2);
        System.out.println("Are both Gmail objects equal? " + isEqual);
    }
}
