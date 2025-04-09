package com.xworkz.swiggit.runner;

import com.xworkz.swiggit.internal.Dictionary;

public class DictionaryRunner {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary("English", 85000, true);
        System.out.println(dictionary);
    }
}
