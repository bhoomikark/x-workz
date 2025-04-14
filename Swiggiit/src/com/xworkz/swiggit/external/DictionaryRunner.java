package com.xworkz.swiggit.external;

import com.xworkz.swiggit.internal.Dictionary;

public class DictionaryRunner {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary("English", 85000, true);
        System.out.println(dictionary);
        System.out.println("Dictionary HashCode: " + dictionary.hashCode());
        System.out.println("Original HashCode: " + System.identityHashCode(dictionary));
        Dictionary dictionary1 = new Dictionary("English", 100000, false);
        Dictionary dictionary2 = new Dictionary("Kannada", 45000, true);

        System.out.println("Are both dictionaries at same location: " + (dictionary1 == dictionary2));
        boolean value = dictionary1.equals(dictionary);
        System.out.println("Are dictionary1 and dictionary equal? " + value);
    }
}
