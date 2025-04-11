package com.xworkz.swiggit.internal;

public class Auto {
    private String autoBrand;
    private boolean isAutoElectric;
    private String autoColor;

    public Auto(String autoBrand, boolean isAutoElectric, String autoColor) {
        this.autoBrand = autoBrand;
        this.isAutoElectric = isAutoElectric;
        this.autoColor = autoColor;
        System.out.println("21. Running Auto Constructor");
    }

    @Override
    public String toString() {
        return "Auto Brand: " + autoBrand + ", Is Auto Electric: " + isAutoElectric +
                ", Auto Color: " + autoColor;
    }
        @Override
                public int hashCode()
        {
            System.out.println("Default Hashcode: "+super.hashCode());
            return 99;
        }
    }

