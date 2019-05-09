package com.example.retrofit.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserInfo {

    @SerializedName("token")
    @Expose
    private String token;


    public UserInfo(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}


