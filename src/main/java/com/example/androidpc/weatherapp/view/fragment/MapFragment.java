package com.example.androidpc.weatherapp.view.fragment;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidpc.weatherapp.R;
import com.example.androidpc.weatherapp.model.City;
import com.example.androidpc.weatherapp.view_model.MapViewModel;

import java.util.List;


public class MapFragment extends Fragment {


    public MapFragment() {
        // Required empty public constructor
    }
    private MapViewModel viewModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewModel = ViewModelProviders.of(this).get(MapViewModel.class);
        getCities();

        return inflater.inflate(R.layout.fragment_map, container, false);
    }

    private void getCities(){
        viewModel.getCities().observe(this, new Observer<List<City>>() {
            @Override
            public void onChanged(@Nullable List<City> cities) {
                //TODO view pins
            }
        });
    }

}
