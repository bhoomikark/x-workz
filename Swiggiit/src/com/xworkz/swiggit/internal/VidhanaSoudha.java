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
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof VidhanaSoudha) {
            VidhanaSoudha vidhana1 = this;
            VidhanaSoudha vidhana2 = (VidhanaSoudha) obj;
            return vidhana1.members == vidhana2.members && vidhana1.location.equals(vidhana2.location);
        }
        return false;
    }
}
