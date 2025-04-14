package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Logo;

public class LogoRunner {
    public static void main(String[] args) {
        Logo logo = new Logo(7, true, "Figma and Illustrator");
        System.out.println("Logo to string: " + logo.toString());
        System.out.println("Overridden HashCode: " + logo.hashCode());
        Logo logo1 = new Logo(7, true, "Figma and Illustrator");
        Logo logo2 = new Logo(5, false, "Canva");

        System.out.println("logo.equals(logo1)? " + logo.equals(logo1));
        System.out.println("logo.equals(logo2)? " + logo.equals(logo2));
    }
}
