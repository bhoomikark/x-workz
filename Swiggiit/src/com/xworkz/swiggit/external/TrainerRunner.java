package com.xworkz.swiggit.external;

import com.xworkz.example.internal.Trainer;

public class TrainerRunner {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("Sneha", "Full Stack Development", true);
        System.out.println(trainer);
        System.out.println("Overridden HashCode: " + trainer.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(trainer));
    }
}
