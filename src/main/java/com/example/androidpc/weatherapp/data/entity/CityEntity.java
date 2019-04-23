package com.example.androidpc.weatherapp.data.entity;

public class CityEntity {
    private String name;
    private CityMain main;
    private CityWind wind;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CityMain getMain() {
        return main;
    }

    public void setMain(CityMain main) {
        this.main = main;
    }

    public CityWind getWind() {
        return wind;
    }

    public void setWind(CityWind wind) {
        this.wind = wind;
    }
}
