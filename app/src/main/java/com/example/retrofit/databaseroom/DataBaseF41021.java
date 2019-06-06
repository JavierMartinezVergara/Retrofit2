package com.example.retrofit.databaseroom;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;



@Database(entities = {DataEntityF41201.class}, version = 4)
public abstract class DataBaseF41021 extends RoomDatabase {


    public abstract DAO_F41201 dao_f41201();

    private static DataBaseF41021 INSTANCE;

    public static synchronized DataBaseF41021 getDataBaseF41021Instance(Context context) {



                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), DataBaseF41021.class, "F41021_db")
                            .fallbackToDestructiveMigration()
                            .addCallback(callbackRoom)
                            .build();
                }

                return INSTANCE;



    }

    public static RoomDatabase.Callback callbackRoom = new RoomDatabase.Callback(){

        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
        }


    };




    private static  class PoblarBaseAsynTask extends AsyncTask<Void,Void,Void>{

        private DAO_F41201 daoF41201;

        private PoblarBaseAsynTask(DataBaseF41021 db){
            daoF41201 = db.dao_f41201();
        }

        @Override
        protected Void doInBackground(Void... voids) {

            //daoF41201.insert(new DataEntityF41201(2,"","",""));
            return null;
        }
    }




}
