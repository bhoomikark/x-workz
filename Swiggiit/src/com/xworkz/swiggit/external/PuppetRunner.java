package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Puppet;

public class PuppetRunner {
    public static void main(String[] args) {
        Puppet puppet = new Puppet(5, "The Brave Little Doll", "Rangoli Theatre");
        System.out.println("Puppet to string: " + puppet.toString());
        System.out.println("Overridden HashCode: " + puppet.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(puppet));

        Puppet puppet1 = new Puppet(5, "The Brave Little Doll", "Rangoli Theatre");
        Puppet puppet2 = new Puppet(10, "The Magic Puppet", "Majestic Theatre");

        System.out.println("puppet.equals(puppet1)? " + puppet.equals(puppet1));
        System.out.println("puppet.equals(puppet2)? " + puppet.equals(puppet2));

    }
}
