package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Cup;

public class CupRunner {
    public static void main(String[] args) {
        Cup cup = new Cup("Ceramic", "Round", "Medium");
        System.out.println("Cups to string: " + cup.toString());
    }
}
