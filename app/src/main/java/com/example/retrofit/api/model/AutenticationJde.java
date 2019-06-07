package com.example.retrofit.api.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "autenticacion")
public class AutenticationJde {

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "username")
    @SerializedName("username")
    @Expose
    private String username;

    @NonNull
    @ColumnInfo(name = "password")
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("environment")
    @Expose
    private String environment;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("deviceName")
    @Expose
    private String deviceName;
    @SerializedName("jasserver")
    @Expose
    private String jasserver;

    @SerializedName("userInfo")
    @Expose
    private UserInfo userInfo;


    public AutenticationJde() {
    }

    public AutenticationJde(String username, String password, String environment, String role, String deviceName) {
        this.username = username;
        this.password = password;
        this.environment = environment;
        this.role = role;
        this.deviceName = deviceName;
    }


    public String getJasserver() {
        return jasserver;
    }

    public UserInfo getUserInfo(){
        return userInfo;
    }
}
