package com.example.retrofit.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("gridData")
    @Expose
    private FormGridData gridData;

    /**
     * No args constructor for use in serialization
     *
     */
    public Data() {
    }

    /**
     *
     * @param gridData
     */
    public Data(FormGridData gridData) {
        super();
        this.gridData = gridData;
    }

    public FormGridData getGridData() {
        return gridData;
    }

    public void setGridData(FormGridData gridData) {
        this.gridData = gridData;
    }

}