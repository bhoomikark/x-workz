package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Dictionary;

public class DictionaryRunner {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary("English", 85000, true);
        System.out.println(dictionary);
        System.out.println("Dictionary HashCode: " + dictionary.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(dictionary));
    }
}
