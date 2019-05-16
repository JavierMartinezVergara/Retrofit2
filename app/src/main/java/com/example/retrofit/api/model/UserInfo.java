package com.example.retrofit.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserInfo {
    @SerializedName("token")
    @Expose
    private String token;


    @SerializedName("alphaName")
    @Expose
    private String alphaName;


    public UserInfo(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public String getAlphaname() {
        return alphaName;
    }
}


