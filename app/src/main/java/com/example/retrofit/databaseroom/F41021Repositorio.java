package com.example.retrofit.databaseroom;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

public class F41021Repositorio {

    private DAO_F41201 dao;
    private LiveData<List<DataEntityF41201>> listLiveDataF41021;

    public F41021Repositorio(Application application ){
        DataBaseF41021 db = DataBaseF41021.getDataBaseF41021Instance(application);
        dao = db.dao_f41201();
        listLiveDataF41021 = dao.cargaConsulta();

    }

    public LiveData<List<DataEntityF41201>> cargaConsulta() {
        return listLiveDataF41021;
    }

    public void insert (DataEntityF41201 dataEntityF41201){
        new insertAsyncTask(dao).execute(dataEntityF41201);

    }


    private static class insertAsyncTask extends AsyncTask<DataEntityF41201,Void,Void>{

        private DAO_F41201 dataDAO;

        private insertAsyncTask(DAO_F41201 dao) {
            this.dataDAO = dao;
        }

        @Override
        protected Void doInBackground(final DataEntityF41201... dataEntityF41201s) {
            dataDAO.insert(dataEntityF41201s[0]);
            return null;
        }
    }



}
