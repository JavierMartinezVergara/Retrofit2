package com.example.retrofit.databaseroom;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

public class F41021Repositorio {

    private DAO_F41201 dao_f41201;
    private LiveData<List<DataEntityF41201>> listLiveDataF41021;

    public F41021Repositorio(Application application){
        DataBaseF41021 db = DataBaseF41021.getDataBaseF41021Instancia(application);
        dao_f41201 = db.dao_f41201();
        listLiveDataF41021 = dao_f41201.cargaConsulta();

    }

    public LiveData<List<DataEntityF41201>> getListLiveDataF41021() {
        return listLiveDataF41021;
    }

    public void insert (DataEntityF41201 dataEntityF41201){
        new AsyncTask<DataEntityF41201,Void,Void>(){

            @Override
            protected Void doInBackground(DataEntityF41201... dataEntityF41201s) {
                return null;
            }
        }
    }
}
