package com.xworkz.swiggit.internal;

public class Dictionary {
    private String language;
    private int totalWords;
    private boolean isHardbound;

    public Dictionary(String language, int totalWords, boolean isHardbound) {
        this.language = language;
        this.totalWords = totalWords;
        this.isHardbound = isHardbound;
        System.out.println("82. Running Dictionary Constructor");
    }

    public String toString() {
        return "Language: " + language + ", Words: " + totalWords + ", Hardbound: " + isHardbound;
    }
}
