package com.xworkz.count.country2;

public class Experience {
    String field;
    int totalYears;
    boolean certified;
    ExperienceDetail[] details;

    public Experience(String field, int totalYears, boolean certified, ExperienceDetail[] details) {
        this.field = field;
        this.totalYears = totalYears;
        this.certified = certified;
        this.details = details;
    }

    void display() {
        System.out.println(" Experience: Field=" + field + ", Years=" + totalYears + ", Certified=" + certified);
        for (ExperienceDetail detail : details) {
            detail.display();
        }
    }
}
