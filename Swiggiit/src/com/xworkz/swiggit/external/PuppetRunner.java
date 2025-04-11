package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Puppet;

public class PuppetRunner {
    public static void main(String[] args) {
        Puppet puppet = new Puppet(5, "The Brave Little Doll", "Rangoli Theatre");
        System.out.println("Puppet to string: " + puppet.toString());
        System.out.println("Overridden HashCode: " + puppet.hashCode());
        System.out.println("Original HashCode using identityHashCode: " + System.identityHashCode(puppet));
    }
}
