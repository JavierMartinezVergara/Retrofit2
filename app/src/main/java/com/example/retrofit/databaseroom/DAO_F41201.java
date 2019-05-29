package com.example.retrofit.databaseroom;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface DAO_F41201
{

    @Query("SELECT * FROM table_F41021")
    public LiveData<List<DataEntityF41201>> cargaConsulta();

    @Query("DELETE * FROM table_F41021")
    void deleteTableF41021();
}
