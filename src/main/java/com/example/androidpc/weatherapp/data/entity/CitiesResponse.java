package com.example.androidpc.weatherapp.data.entity;

import com.example.androidpc.weatherapp.model.City;

import java.util.List;

public class CitiesResponse {
    private List<CityEntity> list;

    public List<CityEntity> getList() {
        return list;
    }

    public void setList(List<CityEntity> list) {
        this.list = list;
    }
}
