package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Trainer;

public class TrainerRunner {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("Sneha", "Full Stack Development", true);
        System.out.println(trainer);
        System.out.println("Overridden HashCode: " + trainer.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(trainer));
        Trainer trainer1 = new Trainer("Sneha", "Full Stack Development", true);
        Trainer trainer2 = new Trainer("John", "Backend Development", false);


        System.out.println("trainer.equals(trainer1)? " + trainer.equals(trainer1));
        System.out.println("trainer.equals(trainer2)? " + trainer.equals(trainer2));
    }
}
