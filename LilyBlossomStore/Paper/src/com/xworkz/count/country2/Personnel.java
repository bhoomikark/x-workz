package com.xworkz.count.country2;

public class Personnel {
    String name;
    int id;
    String role;
    Skill skill;

    public Personnel(String name, int id, String role, Skill skill) {
        this.name = name;
        this.id = id;
        this.role = role;
        this.skill = skill;
    }

    void display() {
        System.out.println(" Personnel: Name=" + name + ", ID=" + id + ", Role=" + role);
        skill.display();
    }
}
