package com.example.retrofit.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SAlphaName20 {

    @SerializedName("value")
    @Expose
    private String value;

    public String getValue() {
        return value;
    }


}
