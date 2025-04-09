package com.xworkz.swiggit.runner;

import com.xworkz.swiggit.internal.Headphone;

public class HeadphoneRunner {
    public static void main(String[] args) {
        Headphone headphone = new Headphone("Boat", true, 1599.99);
        System.out.println(headphone);
    }
}
