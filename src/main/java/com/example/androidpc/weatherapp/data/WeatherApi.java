package com.example.androidpc.weatherapp.data;

import com.example.androidpc.weatherapp.data.entity.CitiesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    // 'EG': ('Egypt', (24.70007, 22.0, 36.86623, 31.58568))

    @GET("box/city/")
    Call<CitiesResponse> getCities(@Query("bbox") String bounding);
}
