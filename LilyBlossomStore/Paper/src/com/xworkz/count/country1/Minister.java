package com.xworkz.count.country1;

public class Minister {
    String name;
    String department;
    int yearsInOffice;
    String partyAffiliation;

    Portfolio[] portfolios;
    House house;
    Security security;
    PersonalAssistant personalAssistant;

    Minister(String name, String department, int yearsInOffice, String partyAffiliation, Portfolio[] portfolios, House house, Security security, PersonalAssistant personalAssistant) {
        this.name = name;
        this.department = department;
        this.yearsInOffice = yearsInOffice;
        this.partyAffiliation = partyAffiliation;
        this.portfolios = portfolios;
        this.house = house;
        this.security = security;
        this.personalAssistant = personalAssistant;
    }

    void display() {
        System.out.println("Minister: " + name + ", Department: " + department + ", Years in Office: " + yearsInOffice + ", Party: " + partyAffiliation);
        if (house != null) house.display();
        if (security != null) security.display();
        if (personalAssistant != null) personalAssistant.printDetails();
        if (portfolios != null) {
            for (Portfolio p : portfolios) {
                if (p != null) p.display();
            }
        }
    }

}
