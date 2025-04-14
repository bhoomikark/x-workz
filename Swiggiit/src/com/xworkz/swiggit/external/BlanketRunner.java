package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Blanket;

public class BlanketRunner {
    public static void main(String[] args) {
        Blanket blanket = new Blanket("Maroon", "Woolen", 2);
        System.out.println("Blanket to string: " + blanket.toString());
        System.out.println("Blanket HashCode: " + blanket.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(blanket));
        Blanket blanket1 = new Blanket("Blue", "Cotton", 1);
        Blanket blanket2 = new Blanket("Maroon", "Silk", 3);

        System.out.println("Are at same location or not: " + (blanket1 == blanket2));
        boolean value = blanket2.equals(blanket);
        System.out.println("Are both blankets same? " + value);
    }
    }

