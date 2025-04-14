package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Paper;

public class PaperRunner {
    public static void main(String[] args) {
        Paper paper = new Paper("The Hindu", "English", 2);

        System.out.println("Paper to string: " + paper.toString());
        System.out.println("Overridden HashCode: " + paper.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(paper));
        Paper paper1 = new Paper("The Hindu", "English", 2);
        Paper paper2 = new Paper("The Times", "English", 3);

        System.out.println("paper.equals(paper1)? " + paper.equals(paper1));
        System.out.println("paper.equals(paper2)? " + paper.equals(paper2));
    }
}
