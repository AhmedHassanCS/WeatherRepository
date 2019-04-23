package com.example.androidpc.weatherapp.data.entity;

public class CityWind {
    private double speed;
    private double deg;

    public void setDegree(double degree) {
        this.deg = degree;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }

    public double getSpeed() {
        return speed;
    }
}
