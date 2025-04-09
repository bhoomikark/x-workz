package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Puppet;

public class PuppetRunner {
    public static void main(String[] args) {
        Puppet puppet = new Puppet(5, "The Brave Little Doll", "Rangoli Theatre");
        System.out.println("Puppet to string: " + puppet.toString());
    }
}
