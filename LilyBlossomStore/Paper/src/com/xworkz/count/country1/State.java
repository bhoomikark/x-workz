package com.xworkz.count.country1;

public class State {
    String stateName;
    String capital;
    int population;
    String chiefMinister;

    State(String stateName, String capital, int population, String chiefMinister) {
        this.stateName = stateName;
        this.capital = capital;
        this.population = population;
        this.chiefMinister = chiefMinister;
    }

    void display() {
        System.out.println("State: " + stateName + ", Capital: " + capital + ", Population: " + population + ", CM: " + chiefMinister);
    }
}
