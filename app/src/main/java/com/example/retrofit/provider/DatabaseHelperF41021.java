package com.example.retrofit.provider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelperF41021 extends SQLiteOpenHelper {


    public DatabaseHelperF41021(Context context,
                          String name,
                          SQLiteDatabase.CursorFactory factory,
                          int version) {
        super(context, name, factory, version);
    }

    public void onCreate(SQLiteDatabase database) {
        createTable(database); // Crear la tabla "gasto"
    }

    /**
     * Crear tabla en la base de datos
     *
     * @param database Instancia de la base de datos
     */
    private void createTable(SQLiteDatabase database) {
        String cmd = "CREATE TABLE " + ContractToF41021.GASTO + " (" +
                ContractToF41021.Columnas._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ContractToF41021.Columnas.F41021LOCN+ " TEXT, " +
                ContractToF41021.Columnas.F41021LOTN + " TEXT, " +
                ContractToF41021.Columnas.F41021MCU + " TEXT," +
                ContractToF41021.Columnas.F41021ITM + " TEXT UNIQUE," +
                ContractToF41021.Columnas.ESTADO + " INTEGER NOT NULL DEFAULT "+ ContractToF41021.ESTADO_OK+"," +
                ContractToF41021.Columnas.PENDIENTE_INSERCION + " INTEGER NOT NULL DEFAULT 0)";
        database.execSQL(cmd);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try { db.execSQL("drop table " + ContractToF41021.GASTO); }
        catch (SQLiteException e) { }
        onCreate(db);
    }

}