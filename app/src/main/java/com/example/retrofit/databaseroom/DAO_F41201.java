package com.example.retrofit.databaseroom;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface DAO_F41201
{

    @Query("SELECT * FROM table_F41021")
    LiveData<List<DataEntityF41201>> cargaConsulta();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(DataEntityF41201 dataEntityF41201);

    @Delete
    void delete(DataEntityF41201 dataEntityF41201);


}
