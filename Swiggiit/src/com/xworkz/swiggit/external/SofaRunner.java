package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Sofa;

public class SofaRunner {
    public static void main(String[] args) {
        Sofa sofa = new Sofa((byte) 3, true, 72);
        System.out.println(sofa);
    }
}
