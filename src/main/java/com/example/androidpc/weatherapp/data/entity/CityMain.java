package com.example.androidpc.weatherapp.data.entity;

public class CityMain {
    private double temp;
    private double humidity;

    public double getHumidity() {
        return humidity;
    }

    public double getTemp() {
        return temp;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
