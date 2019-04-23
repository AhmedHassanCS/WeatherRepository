package com.example.androidpc.weatherapp.data;

import com.example.androidpc.weatherapp.data.entity.CitiesResponse;
import com.example.androidpc.weatherapp.view_model.MapViewModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Data {

    private Retrofit retrofit;
    public Data(Retrofit retrofit){
        this.retrofit = retrofit;
    }

    public void getCities(final MapViewModel.CitiesCallback callback){
        WeatherApi weatherApi = retrofit.create(WeatherApi.class);
        weatherApi.getCities("24.70007,22.0,36.86623,31.58568")
                .enqueue(new Callback<CitiesResponse>() {
                    @Override
                    public void onResponse(Call<CitiesResponse> call, Response<CitiesResponse> response) {
                        if(response.body() != null)
                            callback.onSuccess(Converter.toModels(response.body()));
                        else callback.onError();
                    }

                    @Override
                    public void onFailure(Call<CitiesResponse> call, Throwable t) {
                        callback.onError();
                    }
                });
    }
}
