package com.example.retrofit.databaseroom;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.example.retrofit.api.responses.MnAddressNumber19;


@Entity(tableName = "table_F41021",
        primaryKeys = {"ITM", "MCU", "LOCN", "LOTN"},
        indices = {@Index(value={"ITM", "MCU", "LOCN", "LOTN"})})
public class DataEntityF41201  {




    @NonNull
    @ColumnInfo(name = "ITM")
    private Integer dataBf41021ITM;

    @NonNull
    @ColumnInfo(name = "LOCN")
    private String dataBf41021LOCN;

    @NonNull
    @ColumnInfo(name = "LOTN")
    private String dataBf41021LOTN;

    @NonNull
    @ColumnInfo(name = "MCU")
    private String dataBf41021MCU;

    @Nullable
    @ColumnInfo(name = "PQOH")
    private Integer dataBf4102PQOH;




    public DataEntityF41201(@NonNull Integer dataBf41021ITM, String dataBf41021LOCN, String dataBf41021LOTN, String dataBf41021MCU, Integer dataBf4102PQOH) {
        this.dataBf41021ITM = dataBf41021ITM;
        this.dataBf41021LOCN = dataBf41021LOCN;
        this.dataBf41021LOTN = dataBf41021LOTN;
        this.dataBf41021MCU = dataBf41021MCU;
        this.dataBf4102PQOH = dataBf4102PQOH;
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


    @Nullable
    public Integer getDataBf4102PQOH() {
        return dataBf4102PQOH;
    }

    public void setDataBf4102PQOH(@Nullable Integer dataBf4102PQOH) {
        this.dataBf4102PQOH = dataBf4102PQOH;
    }
}
