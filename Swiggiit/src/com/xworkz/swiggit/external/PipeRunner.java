package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Pipe;

public class PipeRunner {
    public static void main(String[] args) {
        Pipe pipe = new Pipe("PVC", 10, "Ashirvad");
        System.out.println("Pipe to string: " + pipe.toString());
    }
}
