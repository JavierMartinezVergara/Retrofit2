package com.example.retrofit.databaseroom;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;


@Entity(tableName = "table_F41021")
public class DataEntityF41201  {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    private int id;

    @Nullable
    @ColumnInfo(name = "ITM")
    private Integer dataBf41021ITM;

    @Nullable
    @ColumnInfo(name = "LOCN")
    private String dataBf41021LOCN;

    @Nullable
    @ColumnInfo(name = "LOTN")
    private String dataBf41021LOTN;

    @Nullable
    @ColumnInfo(name = "MCU")
    private String dataBf41021MCU;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DataEntityF41201(@NonNull Integer dataBf41021ITM, String dataBf41021LOCN, String dataBf41021LOTN, String dataBf41021MCU) {
        this.dataBf41021ITM = dataBf41021ITM;
        this.dataBf41021LOCN = dataBf41021LOCN;
        this.dataBf41021LOTN = dataBf41021LOTN;
        this.dataBf41021MCU = dataBf41021MCU;
    }



    @NonNull
    public Integer getDataBf41021ITM() {
        return dataBf41021ITM;
    }

    public void setDataBf41021ITM(@NonNull Integer dataBf41021ITM) {
        this.dataBf41021ITM = dataBf41021ITM;
    }

    public String getDataBf41021LOCN() {
        return dataBf41021LOCN;
    }

    public void setDataBf41021LOCN(String dataBf41021LOCN) {
        this.dataBf41021LOCN = dataBf41021LOCN;
    }

    public String getDataBf41021LOTN() {
        return dataBf41021LOTN;
    }

    public void setDataBf41021LOTN(String dataBf41021LOTN) {
        this.dataBf41021LOTN = dataBf41021LOTN;
    }

    public String getDataBf41021MCU() {
        return dataBf41021MCU;
    }

    public void setDataBf41021MCU(String dataBf41021MCU) {
        this.dataBf41021MCU = dataBf41021MCU;
    }
}
