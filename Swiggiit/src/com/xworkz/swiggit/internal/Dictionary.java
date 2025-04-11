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
@Override
    public String toString() {
        return "Language: " + language + ", Words: " + totalWords + ", Hardbound: " + isHardbound;
    }
    @Override
    public int hashCode() {
        System.out.println("Default Hashcode: " + super.hashCode());
        return 777;}
}
