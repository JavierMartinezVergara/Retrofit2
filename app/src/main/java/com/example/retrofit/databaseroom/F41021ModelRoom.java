package com.example.retrofit.databaseroom;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

public class F41021ModelRoom extends AndroidViewModel {

    private F41021Repositorio f41021Repositorio;

    private LiveData<List<DataEntityF41201>> listLiveDataF41021;

    public F41021ModelRoom( Application application) {
        super(application);

        f41021Repositorio = new F41021Repositorio(application);
        listLiveDataF41021 = f41021Repositorio.cargaConsulta();
    }


    public LiveData<List<DataEntityF41201>> cargaConsulta()
    {
        return listLiveDataF41021;
    }

    public void insert(DataEntityF41201 data){

        f41021Repositorio.insert(data);
    }
}