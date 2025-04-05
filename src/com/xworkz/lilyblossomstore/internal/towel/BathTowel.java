package com.xworkz.lilyblossomstore.internal.towel;

public class BathTowel extends Towel {
    public BathTowel() {
        super();
        System.out.println("Child class");
        System.out.println("Running BathTowel Constructor in BathTowel class");
    }

    @Override
    public void absorbWater() {
        System.out.println("Child class");
        System.out.println("Bath towel absorbs more water efficiently.");
    }

    @Override
    public void dry() {
        System.out.println("Child class");
        System.out.println("Bath towel is drying quickly.");
    }
        @Override
        public void wash() {
            System.out.println("Child class");
            System.out.println("Bath towel is being washed with care.");
        }

        @Override
        public void fold() {
            System.out.println("Child class");
            System.out.println("Bath towel is being folded neatly.");
        }

        @Override
        public void hang() {
            System.out.println("Child class");
            System.out.println("Bath towel is hung on a hook to dry.");
        }
    }

