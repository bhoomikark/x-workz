package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Logo;

public class LogoRunner {
    public static void main(String[] args) {
        Logo logo = new Logo(7, true, "Figma and Illustrator");
        System.out.println("Logo to string: " + logo.toString());
        System.out.println("Overridden HashCode: " + logo.hashCode());
    }
}
