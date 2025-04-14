package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Brother;

public class BrotherRunner {
    public static void main(String[] args) {
        Brother brother = new Brother("Arjun", 2, "B.Tech in Mechanical");
        System.out.println(brother);
        System.out.println("Brother HashCode: " + brother.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(brother));
        Brother brother1 = new Brother("Ravi", 1, "MBA");
        Brother brother2 = new Brother("Arjun", 2, "B.Tech in Mechanical");

        System.out.println("Are at same location or not: " + (brother1 == brother2));
        boolean value = brother2.equals(brother);
        System.out.println("Are both brothers same? " + value);
    }

}
