package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Paper;

public class PaperRunner {
    public static void main(String[] args) {
        Paper paper = new Paper("The Hindu", "English", 2);

        System.out.println("Paper to string: " + paper.toString());
        System.out.println("Overridden HashCode: " + paper.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(paper));
    }
}
