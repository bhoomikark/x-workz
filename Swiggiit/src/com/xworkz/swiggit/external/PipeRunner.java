package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Pipe;

public class PipeRunner {
    public static void main(String[] args) {
        Pipe pipe = new Pipe("PVC", 10, "Ashirvad");
        System.out.println("Pipe to string: " + pipe.toString());
        System.out.println("Overridden HashCode: " + pipe.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(pipe));
        Pipe pipe1 = new Pipe("PVC", 10, "Ashirvad");
        Pipe pipe2 = new Pipe("Metal", 12, "Tata");

        System.out.println("pipe.equals(pipe1)? " + pipe.equals(pipe1));
        System.out.println("pipe.equals(pipe2)? " + pipe.equals(pipe2));
    }
}
