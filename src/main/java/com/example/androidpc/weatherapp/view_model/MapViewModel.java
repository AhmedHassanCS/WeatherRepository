package com.example.androidpc.weatherapp.view_model;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;
import android.widget.Toast;

import com.example.androidpc.weatherapp.model.City;
import com.example.androidpc.weatherapp.data.Data;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MapViewModel extends AndroidViewModel {

    private MutableLiveData<List<City>> citiesMutable;
    private Data data;

    public MapViewModel(@NonNull Application application) {
        super(application);

        citiesMutable = new MutableLiveData<>();

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        String BASE_URL = "http://api.openweathermap.org/data/2.5/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        data = new Data(retrofit);
    }

    public LiveData<List<City>> getCities(){

        data.getCities(new CitiesCallback() {
            @Override
            public void onSuccess(List<City> cities) {
                citiesMutable.setValue(cities);
            }

            @Override
            public void onError() {
                Toast.makeText(getApplication(), "Error, Check internet Connection", Toast.LENGTH_LONG).show();
            }
        });
        return citiesMutable;
    }

    public interface CitiesCallback{
        void onSuccess(List<City> cities);
        void onError();
    }
}
