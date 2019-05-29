package com.example.retrofit.databaseroom;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;


@Database(entities = {DataEntityF41201.class}, version = 1)
public abstract class DataBaseF41021 extends RoomDatabase {


    public abstract DAO_F41201 dao_f41201();

    private static DataBaseF41021 INSTANCE;

    static DataBaseF41021 getDataBaseF41021Instancia(Context context){
        if(INSTANCE ==null){

            INSTANCE = Room.databaseBuilder(context, DataBaseF41021.class, "F41021_db")
                    .fallbackToDestructiveMigration()
                    .addCallback(callbackRoom)
                    .build();
        }

        return INSTANCE;
    }

    public static RoomDatabase.Callback callbackRoom = new RoomDatabase.Callback(){



        public void onOpen (SupportSQLiteDatabase db) {

        }

    };


}
