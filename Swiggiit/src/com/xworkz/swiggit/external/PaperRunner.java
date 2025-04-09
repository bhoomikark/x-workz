package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Paper;

public class PaperRunner {
    public static void main(String[] args) {
        Paper paper = new Paper("The Hindu", "English", 2);

        System.out.println("Paper to string: " + paper.toString());
    }
}
