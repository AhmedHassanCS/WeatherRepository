package com.example.androidpc.weatherapp.data;

import com.example.androidpc.weatherapp.data.entity.CitiesResponse;
import com.example.androidpc.weatherapp.data.entity.CityEntity;
import com.example.androidpc.weatherapp.model.City;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    public static List<City> toModels(CitiesResponse response){
        ArrayList<City> models = new ArrayList<>();
        for (CityEntity entity: response.getList()) {
            City city = new City();
            //set name
            city.setName(entity.getName());
            //set temp
            city.setTemp(entity.getMain().getTemp());
            //set humidity
            city.setHumidity(entity.getMain().getHumidity());
            //set degree
            city.setDegree(entity.getWind().getDeg());
            //set wind speed
            city.setWindSpeed(entity.getWind().getSpeed());
            models.add(city);
        }
        return models;
    }
}
