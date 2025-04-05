package com.xworkz.count.country2;

public class Skill {
    String name;
    int expertiseLevel;
    boolean industryCertified;
    Experience experience;

    public Skill(String name, int expertiseLevel, boolean industryCertified, Experience experience) {
        this.name = name;
        this.expertiseLevel = expertiseLevel;
        this.industryCertified = industryCertified;
        this.experience = experience;
    }

    void display() {
        System.out.println(" Skill: Name=" + name + ", Level=" + expertiseLevel + ", Certified=" + industryCertified);
        experience.display();
    }
}
