package com.example.androidpc.weatherapp.model;

import java.io.Serializable;

public class City implements Serializable {


    public void setDegree(double degree) {
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getDegree() {
        return degree;
    }

    private String name;
    private double temp;
    private double humidity;
    private double windSpeed;
    private double degree;
}
