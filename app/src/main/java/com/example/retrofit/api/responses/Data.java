package com.example.retrofit.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("gridData")
    @Expose
    private GridData gridData;

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
    public Data(GridData gridData) {
        super();
        this.gridData = gridData;
    }

    public GridData getGridData() {
        return gridData;
    }

    public void setGridData(GridData gridData) {
        this.gridData = gridData;
    }

}