package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Whitener;

public class WhitenerRunner {
    public static void main(String[] args) {
        Whitener whitener = new Whitener("Camlin", "Pen", true);
        System.out.println(whitener);
    }
}
