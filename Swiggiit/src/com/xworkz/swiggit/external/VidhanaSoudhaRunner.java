package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.VidhanaSoudha;

public class VidhanaSoudhaRunner {
    public static void main(String[] args) {
        VidhanaSoudha vidhana = new VidhanaSoudha(250, "Follow Assembly Code", "Bengaluru");
        System.out.println(vidhana);
        System.out.println("Overridden HashCode: " + vidhana.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(vidhana));
    }
}
