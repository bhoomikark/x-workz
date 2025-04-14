package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.VidhanaSoudha;

public class VidhanaSoudhaRunner {
    public static void main(String[] args) {
        VidhanaSoudha vidhana = new VidhanaSoudha(250, "Follow Assembly Code", "Bengaluru");
        System.out.println(vidhana);
        System.out.println("Overridden HashCode: " + vidhana.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(vidhana));
        VidhanaSoudha vidhana1 = new VidhanaSoudha(250, "Follow Assembly Code", "Bengaluru");
        VidhanaSoudha vidhana2 = new VidhanaSoudha(300, "Follow Assembly Code", "Bengaluru");

        System.out.println("vidhana.equals(vidhana1)? " + vidhana.equals(vidhana1));
        System.out.println("vidhana.equals(vidhana2)? " + vidhana.equals(vidhana2));
    }
}
