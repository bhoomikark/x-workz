package com.xworkz.swiggit.internal;

public class VidhanaSoudha {
    private int members;
    private String rules;
    private String location;

    public VidhanaSoudha(int members, String rules, String location) {
        this.members = members;
        this.rules = rules;
        this.location = location;
        System.out.println("77. Running VidhanaSoudha Constructor");
    }
@Override
    public String toString() {
        return "Members: " + members + ", Rules: " + rules + ", Location: " + location;
    }
    @Override
    public int hashCode() {
        return 125;
    }
}
