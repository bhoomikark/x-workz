package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Scientist;

public class ScientistRunner {
    public static void main(String[] args) {
        Scientist scientist = new Scientist("APJ Abdul Kalam", "India", "Missile Man of India");
        System.out.println(scientist);
    }
}
