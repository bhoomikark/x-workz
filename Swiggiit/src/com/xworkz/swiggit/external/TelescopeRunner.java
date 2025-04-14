package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Telescope;

public class TelescopeRunner {
    public static void main(String[] args) {
        Telescope telescope = new Telescope("Reflecting", 50.0, true);
        System.out.println(telescope);
        System.out.println("Overridden HashCode: " + telescope.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(telescope));
        Telescope telescope1 = new Telescope("Reflecting", 50.0, false);
        Telescope telescope2 = new Telescope("Refracting", 80.0, true);


        System.out.println("telescope.equals(telescope1)? " + telescope.equals(telescope1));
        System.out.println("telescope.equals(telescope2)? " + telescope.equals(telescope2));
    }
}
