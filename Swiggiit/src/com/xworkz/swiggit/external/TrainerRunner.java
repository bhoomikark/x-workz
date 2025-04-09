package com.xworkz.swiggit.external;

import com.xworkz.example.internal.Trainer;

public class TrainerRunner {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("Sneha", "Full Stack Development", true);
        System.out.println(trainer);
    }
}
