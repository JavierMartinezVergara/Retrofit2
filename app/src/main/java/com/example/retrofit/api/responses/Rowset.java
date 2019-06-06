package com.example.retrofit.api.responses;

import android.arch.persistence.room.ColumnInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rowset {

    @SerializedName("rowIndex")
    @Expose
    private Integer rowIndex;

    @SerializedName("MOExist")
    @Expose
    private Boolean mOExist;



    @SerializedName("mnAddressNumber_19")
    @Expose
    private MnAddressNumber19 mnAddressNumber19;

    @SerializedName("sAlphaName_20")
    @Expose
    private SAlphaName20 sAlphaName20;

    /**
     * No args constructor for use in serialization
     *
     */
    public Rowset() {
    }

    /**
     *
     * @param sAlphaName20

     * @param mOExist
     * @param rowIndex
     * @param mnAddressNumber19
     */
    public Rowset(Integer rowIndex, Boolean mOExist,  MnAddressNumber19 mnAddressNumber19, SAlphaName20 sAlphaName20) {
        super();
        this.rowIndex = rowIndex;
        this.mOExist = mOExist;

        this.mnAddressNumber19 = mnAddressNumber19;
        this.sAlphaName20 = sAlphaName20;
    }

    public Integer getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(Integer rowIndex) {
        this.rowIndex = rowIndex;
    }

    public Boolean getMOExist() {
        return mOExist;
    }

    public void setMOExist(Boolean mOExist) {
        this.mOExist = mOExist;
    }


    public MnAddressNumber19 getMnAddressNumber19() {
        return mnAddressNumber19;
    }

    public void setMnAddressNumber19(MnAddressNumber19 mnAddressNumber19) {
        this.mnAddressNumber19 = mnAddressNumber19;
    }

    public SAlphaName20 getSAlphaName20() {
        return sAlphaName20;
    }

    public void setSAlphaName20(SAlphaName20 sAlphaName20) {
        this.sAlphaName20 = sAlphaName20;
    }

}