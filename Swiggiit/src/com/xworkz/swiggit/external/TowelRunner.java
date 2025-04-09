package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Towel;

public class TowelRunner {
    public static void main(String[] args) {
        Towel towel=new Towel("Cotton",2,"Blue");
        System.out.println("Towel to string: "+towel.toString());
    }
}
