package com.xworkz.weather;

import java.io.Serializable;

public class WeatherDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String location;
    private String capturedBy;
    private double temp;
    private String date;


    public WeatherDTO() {
        System.out.println("Created WeatherDTO using no-arg constructor");
    }


    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getCapturedBy() {
        return capturedBy;
    }
    public void setCapturedBy(String capturedBy) {
        this.capturedBy = capturedBy;
    }

    public double getTemp() {
        return temp;
    }
    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}
